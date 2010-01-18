/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v4.xdr;
import java.util.Arrays;
import org.dcache.xdr.*;
import java.io.IOException;
import java.io.Serializable;

public class stateid4 implements XdrAble, Serializable {

    static final long serialVersionUID = -6677150504723505919L;

    public uint32_t seqid;
    public byte [] other;

    public stateid4() {
    }

    public stateid4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        seqid.xdrEncode(xdr);
        xdr.xdrEncodeOpaque(other, 12);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        seqid = new uint32_t(xdr);
        other = xdr.xdrDecodeOpaque(12);
    }

    @Override
    public boolean equals(Object obj) {

        if( obj == this) return true;
        if( !(obj instanceof stateid4) ) return false;

        final stateid4 other_id = (stateid4) obj;

        return this.seqid.value  == other_id.seqid.value &&
                Arrays.equals(this.other, other_id.other);
    }

    @Override
    public int hashCode() {
        return seqid == null? 17 :  seqid.value;
    }

}
// End of stateid4.java