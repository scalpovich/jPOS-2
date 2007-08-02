/*
 * Copyright (c) 2006 jPOS.org
 *
 * See terms of license at http://jpos.org/license.html
 *
 */

package org.jpos.iso;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Runs all the unit tests for the new ISOPackagers.
 * @author jonathan.oconnor@xcom.de
 */
public class AllTests
{
    public static Test suite()
    {
        TestSuite suite = new TestSuite("Tests for new ISO Field Packagers");
        //$JUnit-BEGIN$
        suite.addTest(new TestSuite(LeftPadderTest.class));
        suite.addTest(new TestSuite(RightPadderTest.class));
        suite.addTest(new TestSuite(AsciiInterpreterTest.class));
        suite.addTest(new TestSuite(EbcdicInterpreterTest.class));
        suite.addTest(new TestSuite(LiteralInterpreterTest.class));
        suite.addTest(new TestSuite(AsciiPrefixerTest.class));
        suite.addTest(new TestSuite(EbcdicPrefixerTest.class));
        suite.addTest(new TestSuite(AsciiHexInterpreterTest.class));
        
        suite.addTest(new TestSuite(IF_CHARTest.class));
        suite.addTest(new TestSuite(IF_NOPTest.class));
        suite.addTest(new TestSuite(IF_UNUSEDTest.class));
        suite.addTest(new TestSuite(IFA_AMOUNTTest.class));
        suite.addTest(new TestSuite(IFA_BINARYTest.class));
//        suite.addTest(new TestSuite(IFA_BITMAPTest.class));
        suite.addTest(new TestSuite(IFA_FLLCHARTest.class));
        suite.addTest(new TestSuite(IFA_FLLNUMTest.class));
        suite.addTest(new TestSuite(IFA_LCHARTest.class));
        suite.addTest(new TestSuite(IFA_LLBINARYTest.class));
        suite.addTest(new TestSuite(IFA_LLBNUMTest.class));
        suite.addTest(new TestSuite(IFA_LLCHARTest.class));
        suite.addTest(new TestSuite(IFA_LLLBINARYTest.class));
        suite.addTest(new TestSuite(IFA_LLLCHARTest.class));
        suite.addTest(new TestSuite(IFA_LLLLCHARTest.class));
        suite.addTest(new TestSuite(IFA_LLLLLCHARTest.class));
        suite.addTest(new TestSuite(IFA_LLLNUMTest.class));
        suite.addTest(new TestSuite(IFA_LLNUMTest.class));
        suite.addTest(new TestSuite(IFA_NUMERICTest.class));
        suite.addTest(new TestSuite(IFB_AMOUNTTest.class));
        suite.addTest(new TestSuite(IFB_BINARYTest.class));
//        suite.addTest(new TestSuite(IFB_BITMAPTest.class));
        suite.addTest(new TestSuite(IFB_LLBINARYTest.class));
        suite.addTest(new TestSuite(IFB_LLCHARTest.class));
        suite.addTest(new TestSuite(IFB_LLHBINARYTest.class));
        suite.addTest(new TestSuite(IFB_LLHCHARTest.class));
        suite.addTest(new TestSuite(IFB_LLHECHARTest.class));
        suite.addTest(new TestSuite(IFB_LLHFBINARYTest.class));
        suite.addTest(new TestSuite(IFB_LLHNUMTest.class));
        suite.addTest(new TestSuite(IFB_LLLBINARYTest.class));
        suite.addTest(new TestSuite(IFB_LLLCHARTest.class));
        suite.addTest(new TestSuite(IFB_LLLHBINARYTest.class));
        suite.addTest(new TestSuite(IFB_LLLHECHARTest.class));
        suite.addTest(new TestSuite(IFB_LLLNUMTest.class));
        suite.addTest(new TestSuite(IFB_LLNUMTest.class));
        suite.addTest(new TestSuite(IFB_NUMERICTest.class));
        suite.addTest(new TestSuite(IFE_CHARTest.class));
        suite.addTest(new TestSuite(IFE_LLCHARTest.class));
        suite.addTest(new TestSuite(IFE_LLLBINARYTest.class));
        suite.addTest(new TestSuite(IFE_LLLCHARTest.class));
        suite.addTest(new TestSuite(IFE_LLNUMTest.class));
        suite.addTest(new TestSuite(IFE_NUMERICTest.class));
        suite.addTest(new TestSuite(IFE_AMOUNTTest.class));
        suite.addTest(new TestSuite(IFB_LLLHCHARTest.class));
        suite.addTest(new TestSuite(SignedEbcdicNumberInterpreterTest.class));
        suite.addTest(new TestSuite(ISOMsgTest.class));
        //suite.addTest(new TestSuite(IFEB_LLLNUMTest.class));
        //suite.addTest(new TestSuite(IFEB_LLNUMTest.class));
        //suite.addTest(new TestSuite(IFEP_LLCHARTest.class));
        //suite.addTest(new TestSuite(IFIPM_LLLCHARTest.class));
        //suite.addTest(new TestSuite(IFMC_LLCHARTest.class));
        //$JUnit-END$
        return suite;
    }
}
