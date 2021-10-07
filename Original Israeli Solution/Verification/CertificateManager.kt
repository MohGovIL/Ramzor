package com.ngsoft.ramzor.network

import android.util.Base64
import java.security.MessageDigest
import java.security.Signature
import java.security.cert.Certificate


class CertificateManager {
    companion object {
        fun verify(signedData: String, jsonData: String, cert: Certificate): Boolean {
            //region create sha 256
            val charset = Charsets.UTF_8
            val dataUtf8 = jsonData.toByteArray(charset)
            val md = MessageDigest.getInstance("SHA-256")
            md.reset()
            val hashData = md.digest(dataUtf8)
            //endregion create sha 256

            //region Verify
            //Create Signature SHA256 with RSA for verify
            val signatureVerify = Signature.getInstance("SHA256withRSA")
                    .apply {
                        initVerify(cert)
                        update(hashData)
                    }

            val signedPayloadContent = Base64.decode(signedData, Base64.DEFAULT);
            val verify = signatureVerify.verify(signedPayloadContent)
            //endregion Verify

            return verify
        }
    }
}
