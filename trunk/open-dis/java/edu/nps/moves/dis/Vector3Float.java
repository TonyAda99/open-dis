package edu.nps.moves.dis;

import java.io.*;
import javax.xml.bind.annotation.*;

/**
 * Section 5.2.33. Three floating point values, x, y, and z
 *
 * Copyright (c) 2008, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 *
 * @author DMcG
 */
public class Vector3Float implements Serializable {

    /** X value */
    protected float x;
    /** y Value */
    protected float y;
    /** Z value */
    protected float z;

    /** Constructor */
    public Vector3Float() {
        x = 0;
        y = 0;
        z = 0;
    }

    public int getMarshalledSize() {
        int marshalSize = 0;

        marshalSize += 4;  // x
        marshalSize += 4;  // y
        marshalSize += 4;  // z

        return marshalSize;
    }

    public void setX(float pX) {
        x = pX;
    }

    @XmlAttribute
    public float getX() {
        return x;
    }

    public void setY(float pY) {
        y = pY;
    }

    @XmlAttribute
    public float getY() {
        return y;
    }

    public void setZ(float pZ) {
        z = pZ;
    }

    @XmlAttribute
    public float getZ() {
        return z;
    }

    public void marshal(DataOutputStream dos) {
        try {
            dos.writeFloat(x);
            dos.writeFloat(y);
            dos.writeFloat(z);
        } // end try
        catch (Exception e) {
            System.out.println(e);
        }
    } // end of marshal method

    public void unmarshal(DataInputStream dis) {
        try {
            x = dis.readFloat();
            y = dis.readFloat();
            z = dis.readFloat();
        } // end try
        catch (Exception e) {
            System.out.println(e);
        }
    } // end of unmarshal method

    /**
     * Packs a Pdu into the ByteBuffer.
     * @throws java.nio.BufferOverflowException if buff is too small
     * @throws java.nio.ReadOnlyBufferException if buff is read only
     * @see java.nio.ByteBuffer
     * @param buff The ByteBuffer at the position to begin writing
     * @since ??
     */
    public void marshal(java.nio.ByteBuffer buff) {
        buff.putFloat(x);
        buff.putFloat(y);
        buff.putFloat(z);
    }

    /**
     * Unpacks a Pdu from the underlying data.
     * @throws java.nio.BufferUnderflowException if buff is too small
     * @see java.nio.ByteBuffer
     * @param buff The ByteBuffer at the position to begin reading
     * @since ??
     */
    public void unmarshal(java.nio.ByteBuffer buff) {
        x = buff.getFloat();
        y = buff.getFloat();
        z = buff.getFloat();
    } // end of unmarshal method

    /**
     * The equals method doesn't always work--mostly it works only on classes that consist only of primitives. Be careful.
     * @param rhs
     * @return
     */
    public boolean equals(Vector3Float rhs) {
        boolean ivarsEqual = true;

        if (rhs.getClass() != this.getClass()) {
            return false;
        }

        if (!(x == rhs.x)) {
            ivarsEqual = false;
        }
        if (!(y == rhs.y)) {
            ivarsEqual = false;
        }
        if (!(z == rhs.z)) {
            ivarsEqual = false;
        }

        return ivarsEqual;
    }
} // end of class
