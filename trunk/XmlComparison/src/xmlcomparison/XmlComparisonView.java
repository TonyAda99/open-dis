/*
 * XmlComparisonView.java
 */

package xmlcomparison;

import java.io.*;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.text.*;
import java.util.*;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.filechooser.*;

import edu.nps.moves.exi.*;

/**
 * The application's main frame.
 */
public class XmlComparisonView extends FrameView {


    private File xmlFile;
    private File schemaFile;

    private DefaultTableModel resultsTableModel;
    private Vector columnNames = new Vector();

    public XmlComparisonView(SingleFrameApplication app)
    {
        super(app);

        initComponents();

        columnNames.add("File Name");
        columnNames.add("Transform Type");
        columnNames.add("Original Size");
        columnNames.add("Transformed Size");
        columnNames.add("As % of Original");

        resultsTableModel = new DefaultTableModel(new Vector(), columnNames);
        resultsTable.setModel(resultsTableModel);
        resultsTableModel.addTableModelListener(resultsTable);
        
        // status bar initialization - message timeout, idle icon and busy animation, etc
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusMessageLabel.setText("");
            }
        });
        messageTimer.setRepeats(false);
        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate");
        for (int i = 0; i < busyIcons.length; i++) {
            busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
        }
        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
                statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
            }
        });
        idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
        statusAnimationLabel.setIcon(idleIcon);

        // connecting action tasks to status bar via TaskMonitor
        TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
        taskMonitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                String propertyName = evt.getPropertyName();
                if ("started".equals(propertyName)) {
                    if (!busyIconTimer.isRunning()) {
                        statusAnimationLabel.setIcon(busyIcons[0]);
                        busyIconIndex = 0;
                        busyIconTimer.start();
                    }
                } else if ("done".equals(propertyName)) {
                    busyIconTimer.stop();
                    statusAnimationLabel.setIcon(idleIcon);
                } else if ("message".equals(propertyName)) {
                    String text = (String)(evt.getNewValue());
                    statusMessageLabel.setText((text == null) ? "" : text);
                    messageTimer.restart();
                } else if ("progress".equals(propertyName)) {
                    int value = (Integer)(evt.getNewValue());
                }
            }
        });
    }

    
    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = XmlComparisonApp.getApplication().getMainFrame();
            aboutBox = new XmlComparisonAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        XmlComparisonApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        xmlFileField = new javax.swing.JTextField();
        xmlSchemaField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        setXmlFileButton = new javax.swing.JButton();
        setSchemaButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        mainPanel.setName("mainPanel"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "File Name", "Transform Type", "Original Size", "Transformed Size", "As % of Largest"
            }
        ));
        resultsTable.setName("resultsTable"); // NOI18N
        jScrollPane1.setViewportView(resultsTable);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(xmlcomparison.XmlComparisonApp.class).getContext().getResourceMap(XmlComparisonView.class);
        resultsTable.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("resultsTable.columnModel.title4")); // NOI18N
        resultsTable.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("resultsTable.columnModel.title0")); // NOI18N
        resultsTable.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("resultsTable.columnModel.title1")); // NOI18N
        resultsTable.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("resultsTable.columnModel.title2")); // NOI18N
        resultsTable.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("resultsTable.columnModel.title3")); // NOI18N

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButtHit(evt);
            }
        });

        xmlFileField.setText(resourceMap.getString("xmlFileField.text")); // NOI18N
        xmlFileField.setEnabled(false);
        xmlFileField.setName("xmlFileField"); // NOI18N

        xmlSchemaField.setEditable(false);
        xmlSchemaField.setText(resourceMap.getString("xmlSchemaField.text")); // NOI18N
        xmlSchemaField.setName("xmlSchemaField"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(xmlcomparison.XmlComparisonApp.class).getContext().getActionMap(XmlComparisonView.class, this);
        setXmlFileButton.setAction(actionMap.get("setXmlFileHit")); // NOI18N
        setXmlFileButton.setText(resourceMap.getString("setXmlFileButton.text")); // NOI18N
        setXmlFileButton.setName("setXmlFileButton"); // NOI18N

        setSchemaButton.setAction(actionMap.get("setSchemaFileHit")); // NOI18N
        setSchemaButton.setText(resourceMap.getString("setSchemaButton.text")); // NOI18N
        setSchemaButton.setFocusCycleRoot(true);
        setSchemaButton.setName("setSchemaButton"); // NOI18N

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .add(102, 102, 102)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, mainPanelLayout.createSequentialGroup()
                        .add(jLabel1)
                        .add(18, 18, 18))
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(xmlSchemaField)
                    .add(xmlFileField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(setXmlFileButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 136, Short.MAX_VALUE)
                        .add(jButton1)
                        .add(93, 93, 93))
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(setSchemaButton)
                        .addContainerGap())))
            .add(mainPanelLayout.createSequentialGroup()
                .add(82, 82, 82)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 598, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .add(52, 52, 52)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(xmlFileField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(setXmlFileButton))
                .add(1, 1, 1)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(xmlSchemaField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2)
                    .add(setSchemaButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1))
        );

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        statusPanel.setName("statusPanel"); // NOI18N

        statusPanelSeparator.setName("statusPanelSeparator"); // NOI18N

        statusMessageLabel.setName("statusMessageLabel"); // NOI18N

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statusAnimationLabel.setName("statusAnimationLabel"); // NOI18N

        org.jdesktop.layout.GroupLayout statusPanelLayout = new org.jdesktop.layout.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(statusPanelSeparator, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .add(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(statusMessageLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 669, Short.MAX_VALUE)
                .add(statusAnimationLabel)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(statusPanelLayout.createSequentialGroup()
                .add(statusPanelSeparator, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(statusPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(statusMessageLabel)
                    .add(statusAnimationLabel))
                .add(3, 3, 3))
        );

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setName("jTable2"); // NOI18N
        jScrollPane2.setViewportView(jTable2);

        setComponent(mainPanel);
        setMenuBar(menuBar);
        setStatusBar(statusPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void computeButtHit(java.awt.event.ActionEvent evt)//GEN-FIRST:event_computeButtHit
    {//GEN-HEADEREND:event_computeButtHit
        String xmlFilePath = xmlFile.getAbsolutePath();
        String schemaFilePath = null;
        String dataFileName = xmlFile.getName();
        File dataDir = null;
        File dataFile;

        XmlNoOp noOp = null;
        XmlGzip gzip = null;
        SeimensExiNoSchema noSchema = null;
        SeimensExiSchema schema = null;

        if(schemaFile != null)
        {
            schemaFilePath = schemaFile.getAbsolutePath();
        }
        
        try
        {
            dataDir = new File("data");
            dataDir.mkdir();

            File noOpFile = new File(dataDir, dataFileName);
            noOp = new XmlNoOp("Original", xmlFilePath, noOpFile.getAbsolutePath() );
            noOp.transformXmlFile();

            File zipFile = new File(dataDir, dataFileName + ".zip");
            gzip = new XmlGzip("Zipped", xmlFilePath, zipFile.getAbsolutePath());
            gzip.transformXmlFile();

            File exiNoSchema = new File(dataDir, dataFileName + ".exi");
            noSchema = new SeimensExiNoSchema("EXI, No Schema", xmlFilePath, exiNoSchema.getAbsolutePath());
            noSchema.transformXmlFile();

            if(schemaFilePath != null)
            {
                File exiSchema = new File(dataDir, dataFileName + ".schema.exi");
                schema = new SeimensExiSchema("(Not Working) EXI, With Schema", xmlFilePath, schemaFilePath, exiNoSchema.getAbsolutePath());
                schema.transformXmlFile();
            }

            double transformedPercent = 0.0;
            NumberFormat nf = NumberFormat.getPercentInstance(Locale.US);
            nf.setMaximumFractionDigits(2);

            long originalSize = noOp.getTransformedSize();
            Object[] noOpRowData = noOp.getRowData();
            noOpRowData[2] = new Long(originalSize);
            transformedPercent = ((double)noOp.getTransformedSize()/(double)originalSize);
            noOpRowData[4] = nf.format(transformedPercent);

            Object[] gzipRowData = gzip.getRowData();
            gzipRowData[2] = new Long(originalSize);
            transformedPercent = ((double)gzip.getTransformedSize()/(double)originalSize);
            gzipRowData[4] = nf.format(transformedPercent);

            Object[] exiRowData = noSchema.getRowData();
            exiRowData[2] = new Long(originalSize);
            transformedPercent = ((double)noSchema.getTransformedSize()/(double)originalSize);
            exiRowData[4] = nf.format(transformedPercent);

            Object[] schemaRowData = null;
            if(schema != null)
            {
                schemaRowData = schema.getRowData();
                schemaRowData[2] = new Long(originalSize);
                transformedPercent = ((double)schema.getTransformedSize()/(double)originalSize);
                schemaRowData[4] = nf.format(transformedPercent);
            }

            resultsTableModel.addRow(noOpRowData);
            resultsTableModel.addRow(gzipRowData);
            resultsTableModel.addRow(exiRowData);
            if(schema != null)
            {
                resultsTableModel.addRow(schemaRowData);
            }


            
        }
        catch(Exception e)
        {
            System.out.println("can't make directory");
        }





    }//GEN-LAST:event_computeButtHit

    @Action
    public void setXmlFileHit()
    {
        JFileChooser chooser = new JFileChooser();
        javax.swing.filechooser.FileFilter xmlFilter = new javax.swing.filechooser.FileFilter()
        {
            public boolean accept(File f)
            {
                if(f.getName().endsWith(".xml"))
                        return true;
                if(f.getName().endsWith(".x3d"))
                        return true;
                return false;
            }
            public String getDescription()
            {
                return "XML Files";
            }
        };

        chooser.setFileFilter(xmlFilter);
        int returnValue = chooser.showOpenDialog(mainPanel);
        if(returnValue ==JFileChooser.APPROVE_OPTION)
        {
            xmlFile = chooser.getSelectedFile();
            try
            {
                xmlFileField.setText(xmlFile.getCanonicalPath());
            }
            catch(Exception e)
            {
                xmlFileField.setText("no such file");
            }

        }
    }

    @Action
    public void setSchemaFileHit()
    {
         JFileChooser chooser = new JFileChooser();
         javax.swing.filechooser.FileFilter xmlFilter = new javax.swing.filechooser.FileFilter()
        {
            public boolean accept(File f)
            {
                if(f.getName().endsWith(".xsd"))
                        return true;
                return false;
            }
            public String getDescription()
            {
                return "XML Files";
            }
        };

        chooser.setFileFilter(xmlFilter);
        int returnValue = chooser.showOpenDialog(mainPanel);
        if(returnValue ==JFileChooser.APPROVE_OPTION)
        {
            schemaFile = chooser.getSelectedFile();
            try
            {
                xmlSchemaField.setText(schemaFile.getCanonicalPath());
            }
            catch(Exception e)
            {
                xmlSchemaField.setText("no such file");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTable resultsTable;
    private javax.swing.JButton setSchemaButton;
    private javax.swing.JButton setXmlFileButton;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JTextField xmlFileField;
    private javax.swing.JTextField xmlSchemaField;
    // End of variables declaration//GEN-END:variables

    private final Timer messageTimer;
    private final Timer busyIconTimer;
    private final Icon idleIcon;
    private final Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;

    private JDialog aboutBox;
}