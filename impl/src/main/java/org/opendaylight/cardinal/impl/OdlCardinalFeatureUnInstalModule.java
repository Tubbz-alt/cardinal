/*
 * Copyright © 2015 TCS and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.cardinal.impl;
//

//

// java imports
//
import java.io.Serializable;

// jmx imports
//
import javax.management.MBeanServer;
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;

/**
 * The class is used for implementing the "OdlCardinalFeatureUnInstalModule"
 * group. The group is defined with the following oid: 1.3.6.1.3.1.1.3.
 */
public class OdlCardinalFeatureUnInstalModule implements OdlCardinalFeatureUnInstalModuleMBean, Serializable {

    /**
     * Variable for storing the value of "FeatureUnInstalled9". The variable is
     * identified by: "1.3.6.1.3.1.1.3.9".
     *
     * "To be done"
     *
     */
    protected String FeatureUnInstalled9 = new String("Opendaylight Node Information");

    /**
     * Variable for storing the value of "FeatureUnInstalled8". The variable is
     * identified by: "1.3.6.1.3.1.1.3.8".
     *
     * "To be done"
     *
     */
    protected String FeatureUnInstalled8 = new String("Opendaylight Node Information");

    /**
     * Variable for storing the value of "FeatureUnInstalled7". The variable is
     * identified by: "1.3.6.1.3.1.1.3.7".
     *
     * "To be done"
     *
     */
    protected String FeatureUnInstalled7 = new String("Opendaylight Node Information");

    /**
     * Variable for storing the value of "FeatureUnInstalled6". The variable is
     * identified by: "1.3.6.1.3.1.1.3.6".
     *
     * "To be done"
     *
     */
    protected String FeatureUnInstalled6 = new String("Opendaylight Node Information");

    /**
     * Variable for storing the value of "FeatureUnInstalled5". The variable is
     * identified by: "1.3.6.1.3.1.1.3.5".
     *
     * "To be done"
     *
     */
    protected String FeatureUnInstalled5 = new String("Opendaylight Node Information");

    /**
     * Variable for storing the value of "FeatureUnInstalled4". The variable is
     * identified by: "1.3.6.1.3.1.1.3.4".
     *
     * "To be done"
     *
     */
    protected String FeatureUnInstalled4 = new String("Opendaylight Node Information");

    /**
     * Variable for storing the value of "FeatureUnInstalled3". The variable is
     * identified by: "1.3.6.1.3.1.1.3.3".
     *
     * "To be done"
     *
     */
    protected String FeatureUnInstalled3 = new String("Opendaylight Node Information");

    /**
     * Variable for storing the value of "FeatureUnInstalled2". The variable is
     * identified by: "1.3.6.1.3.1.1.3.2".
     *
     * "To be done"
     *
     */
    protected String FeatureUnInstalled2 = new String("Opendaylight Node Information");

    /**
     * Variable for storing the value of "FeatureUnInstalled1". The variable is
     * identified by: "1.3.6.1.3.1.1.3.1".
     *
     * "To be done"
     *
     */
    protected String FeatureUnInstalled1 = new String("Opendaylight Node Information");

    /**
     * Variable for storing the value of "FeatureUnInstalled10". The variable is
     * identified by: "1.3.6.1.3.1.1.3.10".
     *
     * "To be done"
     *
     */
    protected String FeatureUnInstalled10 = new String("Opendaylight Node Information");

    /**
     * Variable for storing the value of "OdlKarafFeatureListUnInstalled". The
     * variable is identified by: "1.3.6.1.3.1.1.3.0".
     *
     * "To be done"
     *
     */
    protected String OdlKarafFeatureListUnInstalled = new String("Opendaylight Node Information");

    /**
     * Constructor for the "OdlCardinalFeatureUnInstalModule" group. If the
     * group contains a table, the entries created through an SNMP SET will not
     * be registered in Java DMK.
     */
    public OdlCardinalFeatureUnInstalModule(SnmpMib myMib) {
    }

    /**
     * Constructor for the "OdlCardinalFeatureUnInstalModule" group. If the
     * group contains a table, the entries created through an SNMP SET will be
     * AUTOMATICALLY REGISTERED in Java DMK.
     */
    public OdlCardinalFeatureUnInstalModule(SnmpMib myMib, MBeanServer server) {
    }

    /**
     * Getter for the "FeatureUnInstalled9" variable.
     */
    public String getFeatureUnInstalled9() throws SnmpStatusException {
        return FeatureUnInstalled9;
    }

    /**
     * Setter for the "FeatureUnInstalled9" variable.
     */
    public void setFeatureUnInstalled9(String x) throws SnmpStatusException {
        FeatureUnInstalled9 = x;
    }

    /**
     * Checker for the "FeatureUnInstalled9" variable.
     */
    public void checkFeatureUnInstalled9(String x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

    /**
     * Getter for the "FeatureUnInstalled8" variable.
     */
    public String getFeatureUnInstalled8() throws SnmpStatusException {
        return FeatureUnInstalled8;
    }

    /**
     * Setter for the "FeatureUnInstalled8" variable.
     */
    public void setFeatureUnInstalled8(String x) throws SnmpStatusException {
        FeatureUnInstalled8 = x;
    }

    /**
     * Checker for the "FeatureUnInstalled8" variable.
     */
    public void checkFeatureUnInstalled8(String x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

    /**
     * Getter for the "FeatureUnInstalled7" variable.
     */
    public String getFeatureUnInstalled7() throws SnmpStatusException {
        return FeatureUnInstalled7;
    }

    /**
     * Setter for the "FeatureUnInstalled7" variable.
     */
    public void setFeatureUnInstalled7(String x) throws SnmpStatusException {
        FeatureUnInstalled7 = x;
    }

    /**
     * Checker for the "FeatureUnInstalled7" variable.
     */
    public void checkFeatureUnInstalled7(String x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

    /**
     * Getter for the "FeatureUnInstalled6" variable.
     */
    public String getFeatureUnInstalled6() throws SnmpStatusException {
        return FeatureUnInstalled6;
    }

    /**
     * Setter for the "FeatureUnInstalled6" variable.
     */
    public void setFeatureUnInstalled6(String x) throws SnmpStatusException {
        FeatureUnInstalled6 = x;
    }

    /**
     * Checker for the "FeatureUnInstalled6" variable.
     */
    public void checkFeatureUnInstalled6(String x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

    /**
     * Getter for the "FeatureUnInstalled5" variable.
     */
    public String getFeatureUnInstalled5() throws SnmpStatusException {
        return FeatureUnInstalled5;
    }

    /**
     * Setter for the "FeatureUnInstalled5" variable.
     */
    public void setFeatureUnInstalled5(String x) throws SnmpStatusException {
        FeatureUnInstalled5 = x;
    }

    /**
     * Checker for the "FeatureUnInstalled5" variable.
     */
    public void checkFeatureUnInstalled5(String x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

    /**
     * Getter for the "FeatureUnInstalled4" variable.
     */
    public String getFeatureUnInstalled4() throws SnmpStatusException {
        return FeatureUnInstalled4;
    }

    /**
     * Setter for the "FeatureUnInstalled4" variable.
     */
    public void setFeatureUnInstalled4(String x) throws SnmpStatusException {
        FeatureUnInstalled4 = x;
    }

    /**
     * Checker for the "FeatureUnInstalled4" variable.
     */
    public void checkFeatureUnInstalled4(String x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

    /**
     * Getter for the "FeatureUnInstalled3" variable.
     */
    public String getFeatureUnInstalled3() throws SnmpStatusException {
        return FeatureUnInstalled3;
    }

    /**
     * Setter for the "FeatureUnInstalled3" variable.
     */
    public void setFeatureUnInstalled3(String x) throws SnmpStatusException {
        FeatureUnInstalled3 = x;
    }

    /**
     * Checker for the "FeatureUnInstalled3" variable.
     */
    public void checkFeatureUnInstalled3(String x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

    /**
     * Getter for the "FeatureUnInstalled2" variable.
     */
    public String getFeatureUnInstalled2() throws SnmpStatusException {
        return FeatureUnInstalled2;
    }

    /**
     * Setter for the "FeatureUnInstalled2" variable.
     */
    public void setFeatureUnInstalled2(String x) throws SnmpStatusException {
        FeatureUnInstalled2 = x;
    }

    /**
     * Checker for the "FeatureUnInstalled2" variable.
     */
    public void checkFeatureUnInstalled2(String x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

    /**
     * Getter for the "FeatureUnInstalled1" variable.
     */
    public String getFeatureUnInstalled1() throws SnmpStatusException {
        return FeatureUnInstalled1;
    }

    /**
     * Setter for the "FeatureUnInstalled1" variable.
     */
    public void setFeatureUnInstalled1(String x) throws SnmpStatusException {
        FeatureUnInstalled1 = x;
    }

    /**
     * Checker for the "FeatureUnInstalled1" variable.
     */
    public void checkFeatureUnInstalled1(String x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

    /**
     * Getter for the "FeatureUnInstalled10" variable.
     */
    public String getFeatureUnInstalled10() throws SnmpStatusException {
        return FeatureUnInstalled10;
    }

    /**
     * Setter for the "FeatureUnInstalled10" variable.
     */
    public void setFeatureUnInstalled10(String x) throws SnmpStatusException {
        FeatureUnInstalled10 = x;
    }

    /**
     * Checker for the "FeatureUnInstalled10" variable.
     */
    public void checkFeatureUnInstalled10(String x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

    /**
     * Getter for the "OdlKarafFeatureListUnInstalled" variable.
     */
    public String getOdlKarafFeatureListUnInstalled() throws SnmpStatusException {
        return OdlKarafFeatureListUnInstalled;
    }

    /**
     * Setter for the "OdlKarafFeatureListUnInstalled" variable.
     */
    public void setOdlKarafFeatureListUnInstalled(String x) throws SnmpStatusException {
        OdlKarafFeatureListUnInstalled = x;
    }

    /**
     * Checker for the "OdlKarafFeatureListUnInstalled" variable.
     */
    public void checkOdlKarafFeatureListUnInstalled(String x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

}
