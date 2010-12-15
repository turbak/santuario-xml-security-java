
/*
 * Copyright  1999-2004 The Apache Software Foundation.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.xml.security.signature;





/**
 * Raised if verifying a {@link org.apache.xml.security.signature.Reference} fails
 * because of an uninitialized {@link org.apache.xml.security.signature.XMLSignatureInput}
 *
 * @author Christian Geuer-Pollmann
 */
public class ReferenceNotInitializedException extends XMLSignatureException {

   /**
    * Constructor ReferenceNotInitializedException
    *
    */
   public ReferenceNotInitializedException() {
      super();
   }

   /**
    * Constructor ReferenceNotInitializedException
    *
    * @param _msgID
    */
   public ReferenceNotInitializedException(String _msgID) {
      super(_msgID);
   }

   /**
    * Constructor ReferenceNotInitializedException
    *
    * @param _msgID
    * @param exArgs
    */
   public ReferenceNotInitializedException(String _msgID, Object exArgs[]) {
      super(_msgID, exArgs);
   }

   /**
    * Constructor ReferenceNotInitializedException
    *
    * @param _msgID
    * @param originalException
    */
   public ReferenceNotInitializedException(String _msgID,
                                           Exception _originalException) {
      super(_msgID, _originalException);
   }

   /**
    * Constructor ReferenceNotInitializedException
    *
    * @param _msgID
    * @param exArgs
    * @param originalException
    */
   public ReferenceNotInitializedException(String _msgID, Object exArgs[],
                                           Exception _originalException) {
      super(_msgID, exArgs, _originalException);
   }
}
