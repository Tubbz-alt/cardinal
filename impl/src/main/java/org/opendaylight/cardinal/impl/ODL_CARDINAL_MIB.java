/*
 * Copyright © 2015 TCS and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.cardinal.impl;

// java imports
//
import java.io.Serializable;
import java.util.Hashtable;

// jmx imports
//
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.InstanceAlreadyExistsException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpMibNode;
import com.sun.management.snmp.agent.SnmpMibTable;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;

/**
 * The class is used for representing "ODL-CARDINAL-MIB". You can edit the file
 * if you want to modify the behavior of the MIB.
 */
public class ODL_CARDINAL_MIB extends SnmpMib implements Serializable {

    /**
     * Default constructor. Initialize the Mib tree.
     */
    public ODL_CARDINAL_MIB() {
        mibName = "ODL_CARDINAL_MIB";
    }

    /**
     * Initialization of the MIB with no registration in Java DMK.
     */
    public void init() throws IllegalAccessException {
        // Allow only one initialization of the MIB.
        //
        if (isInitialized == true) {
            return;
        }

        try {
            populate(null, null);
        } catch (IllegalAccessException x) {
            throw x;
        } catch (RuntimeException x) {
            throw x;
        } catch (Exception x) {
            throw new RuntimeException(x);
        }

        isInitialized = true;
    }

    /**
     * Initialization of the MIB with AUTOMATIC REGISTRATION in Java DMK.
     */
    public ObjectName preRegister(MBeanServer server, ObjectName name) throws Exception {
        // Allow only one initialization of the MIB.
        //
        if (isInitialized == true) {
            throw new InstanceAlreadyExistsException();
        }

        // Initialize MBeanServer information.
        //
        this.server = server;

        populate(server, name);

        isInitialized = true;
        return name;
    }

    /**
     * Initialization of the MIB with no registration in Java DMK.
     */
    public void populate(MBeanServer server, ObjectName name) throws Exception {
        // Allow only one initialization of the MIB.
        //
        if (isInitialized == true) {
            return;
        }

        if (objectserver == null)
            objectserver = new SnmpStandardObjectServer();

        // Initialization of the "OdlCardinalBundleResolvedModule" group.
        // To disable support of this group, redefine the
        // "createOdlCardinalBundleResolvedModuleMetaNode()" factory method, and
        // make it return "null"
        //
        initOdlCardinalBundleResolvedModule(server);

        // Initialization of the "OdlCardinalBundleInActiveModule" group.
        // To disable support of this group, redefine the
        // "createOdlCardinalBundleInActiveModuleMetaNode()" factory method, and
        // make it return "null"
        //
        initOdlCardinalBundleInActiveModule(server);

        // Initialization of the "OdlCardinalBundleActiveModule" group.
        // To disable support of this group, redefine the
        // "createOdlCardinalBundleActiveModuleMetaNode()" factory method, and
        // make it return "null"
        //
        initOdlCardinalBundleActiveModule(server);

        // Initialization of the "OdlCardinalFeatureUnInstalModule" group.
        // To disable support of this group, redefine the
        // "createOdlCardinalFeatureUnInstalModuleMetaNode()" factory method,
        // and make it return "null"
        //
        initOdlCardinalFeatureUnInstalModule(server);

        // Initialization of the "OdlCardinalFeatureInstallModule" group.
        // To disable support of this group, redefine the
        // "createOdlCardinalFeatureInstallModuleMetaNode()" factory method, and
        // make it return "null"
        //
        initOdlCardinalFeatureInstallModule(server);

        // Initialization of the "OdlCardinalMainModule" group.
        // To disable support of this group, redefine the
        // "createOdlCardinalMainModuleMetaNode()" factory method, and make it
        // return "null"
        //
        initOdlCardinalMainModule(server);

        // Initialization of the "OdlCardinalProjectModule" group.
        // To disable support of this group, redefine the
        // "createOdlCardinalProjectModuleMetaNode()" factory method, and make
        // it return "null"
        //
        initOdlCardinalProjectModule(server);

        // Initialization of the "OdlCardinalKarafShellModule" group.
        // To disable support of this group, redefine the
        // "createOdlCardinalKarafShellModuleMetaNode()" factory method, and
        // make it return "null"
        //
        initOdlCardinalKarafShellModule(server);

        isInitialized = true;
    }

    // ------------------------------------------------------------
    //
    // Initialization of the "OdlCardinalBundleResolvedModule" group.
    //
    // ------------------------------------------------------------

    /**
     * Initialization of the "OdlCardinalBundleResolvedModule" group.
     * 
     * To disable support of this group, redefine the
     * "createOdlCardinalBundleResolvedModuleMetaNode()" factory method, and
     * make it return "null"
     * 
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     **/
    protected void initOdlCardinalBundleResolvedModule(MBeanServer server) throws Exception {
        final String oid = getGroupOid("OdlCardinalBundleResolvedModule", "1.3.6.1.3.1.1.6");
        ObjectName objname = null;
        if (server != null) {
            objname = getGroupObjectName("OdlCardinalBundleResolvedModule", oid,
                    mibName + ":name=OdlCardinalBundleResolvedModule");
        }
        final OdlCardinalBundleResolvedModuleMeta meta = createOdlCardinalBundleResolvedModuleMetaNode(
                "OdlCardinalBundleResolvedModule", oid, objname, server);
        if (meta != null) {
            meta.registerTableNodes(this, server);

            // Note that when using standard metadata,
            // the returned object must implement the
            // "OdlCardinalBundleResolvedModuleMBean"
            // interface.
            //
            final OdlCardinalBundleResolvedModuleMBean group = (OdlCardinalBundleResolvedModuleMBean) createOdlCardinalBundleResolvedModuleMBean(
                    "OdlCardinalBundleResolvedModule", oid, objname, server);
            meta.setInstance(group);
            registerGroupNode("OdlCardinalBundleResolvedModule", oid, objname, meta, group, server);
        }
    }

    /**
     * Factory method for "OdlCardinalBundleResolvedModule" group metadata
     * class.
     * 
     * You can redefine this method if you need to replace the default generated
     * metadata class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalBundleResolvedModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the metadata class generated for the
     *         "OdlCardinalBundleResolvedModule" group
     *         (OdlCardinalBundleResolvedModuleMeta)
     * 
     **/
    protected OdlCardinalBundleResolvedModuleMeta createOdlCardinalBundleResolvedModuleMetaNode(String groupName,
            String groupOid, ObjectName groupObjname, MBeanServer server) {
        return new OdlCardinalBundleResolvedModuleMeta(this, objectserver);
    }

    /**
     * Factory method for "OdlCardinalBundleResolvedModule" group MBean.
     * 
     * You can redefine this method if you need to replace the default generated
     * MBean class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalBundleResolvedModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the MBean class generated for the
     *         "OdlCardinalBundleResolvedModule" group
     *         (OdlCardinalBundleResolvedModule)
     * 
     *         Note that when using standard metadata, the returned object must
     *         implement the "OdlCardinalBundleResolvedModuleMBean" interface.
     **/
    protected Object createOdlCardinalBundleResolvedModuleMBean(String groupName, String groupOid,
            ObjectName groupObjname, MBeanServer server) {

        // Note that when using standard metadata,
        // the returned object must implement the
        // "OdlCardinalBundleResolvedModuleMBean"
        // interface.
        //
        if (server != null)
            return new OdlCardinalBundleResolvedModule(this, server);
        else
            return new OdlCardinalBundleResolvedModule(this);
    }

    // ------------------------------------------------------------
    //
    // Initialization of the "OdlCardinalBundleInActiveModule" group.
    //
    // ------------------------------------------------------------

    /**
     * Initialization of the "OdlCardinalBundleInActiveModule" group.
     * 
     * To disable support of this group, redefine the
     * "createOdlCardinalBundleInActiveModuleMetaNode()" factory method, and
     * make it return "null"
     * 
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     **/
    protected void initOdlCardinalBundleInActiveModule(MBeanServer server) throws Exception {
        final String oid = getGroupOid("OdlCardinalBundleInActiveModule", "1.3.6.1.3.1.1.5");
        ObjectName objname = null;
        if (server != null) {
            objname = getGroupObjectName("OdlCardinalBundleInActiveModule", oid,
                    mibName + ":name=OdlCardinalBundleInActiveModule");
        }
        final OdlCardinalBundleInActiveModuleMeta meta = createOdlCardinalBundleInActiveModuleMetaNode(
                "OdlCardinalBundleInActiveModule", oid, objname, server);
        if (meta != null) {
            meta.registerTableNodes(this, server);

            // Note that when using standard metadata,
            // the returned object must implement the
            // "OdlCardinalBundleInActiveModuleMBean"
            // interface.
            //
            final OdlCardinalBundleInActiveModuleMBean group = (OdlCardinalBundleInActiveModuleMBean) createOdlCardinalBundleInActiveModuleMBean(
                    "OdlCardinalBundleInActiveModule", oid, objname, server);
            meta.setInstance(group);
            registerGroupNode("OdlCardinalBundleInActiveModule", oid, objname, meta, group, server);
        }
    }

    /**
     * Factory method for "OdlCardinalBundleInActiveModule" group metadata
     * class.
     * 
     * You can redefine this method if you need to replace the default generated
     * metadata class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalBundleInActiveModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the metadata class generated for the
     *         "OdlCardinalBundleInActiveModule" group
     *         (OdlCardinalBundleInActiveModuleMeta)
     * 
     **/
    protected OdlCardinalBundleInActiveModuleMeta createOdlCardinalBundleInActiveModuleMetaNode(String groupName,
            String groupOid, ObjectName groupObjname, MBeanServer server) {
        return new OdlCardinalBundleInActiveModuleMeta(this, objectserver);
    }

    /**
     * Factory method for "OdlCardinalBundleInActiveModule" group MBean.
     * 
     * You can redefine this method if you need to replace the default generated
     * MBean class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalBundleInActiveModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the MBean class generated for the
     *         "OdlCardinalBundleInActiveModule" group
     *         (OdlCardinalBundleInActiveModule)
     * 
     *         Note that when using standard metadata, the returned object must
     *         implement the "OdlCardinalBundleInActiveModuleMBean" interface.
     **/
    protected Object createOdlCardinalBundleInActiveModuleMBean(String groupName, String groupOid,
            ObjectName groupObjname, MBeanServer server) {

        // Note that when using standard metadata,
        // the returned object must implement the
        // "OdlCardinalBundleInActiveModuleMBean"
        // interface.
        //
        if (server != null)
            return new OdlCardinalBundleInActiveModule(this, server);
        else
            return new OdlCardinalBundleInActiveModule(this);
    }

    // ------------------------------------------------------------
    //
    // Initialization of the "OdlCardinalBundleActiveModule" group.
    //
    // ------------------------------------------------------------

    /**
     * Initialization of the "OdlCardinalBundleActiveModule" group.
     * 
     * To disable support of this group, redefine the
     * "createOdlCardinalBundleActiveModuleMetaNode()" factory method, and make
     * it return "null"
     * 
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     **/
    protected void initOdlCardinalBundleActiveModule(MBeanServer server) throws Exception {
        final String oid = getGroupOid("OdlCardinalBundleActiveModule", "1.3.6.1.3.1.1.4");
        ObjectName objname = null;
        if (server != null) {
            objname = getGroupObjectName("OdlCardinalBundleActiveModule", oid,
                    mibName + ":name=OdlCardinalBundleActiveModule");
        }
        final OdlCardinalBundleActiveModuleMeta meta = createOdlCardinalBundleActiveModuleMetaNode(
                "OdlCardinalBundleActiveModule", oid, objname, server);
        if (meta != null) {
            meta.registerTableNodes(this, server);

            // Note that when using standard metadata,
            // the returned object must implement the
            // "OdlCardinalBundleActiveModuleMBean"
            // interface.
            //
            final OdlCardinalBundleActiveModuleMBean group = (OdlCardinalBundleActiveModuleMBean) createOdlCardinalBundleActiveModuleMBean(
                    "OdlCardinalBundleActiveModule", oid, objname, server);
            meta.setInstance(group);
            registerGroupNode("OdlCardinalBundleActiveModule", oid, objname, meta, group, server);
        }
    }

    /**
     * Factory method for "OdlCardinalBundleActiveModule" group metadata class.
     * 
     * You can redefine this method if you need to replace the default generated
     * metadata class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalBundleActiveModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the metadata class generated for the
     *         "OdlCardinalBundleActiveModule" group
     *         (OdlCardinalBundleActiveModuleMeta)
     * 
     **/
    protected OdlCardinalBundleActiveModuleMeta createOdlCardinalBundleActiveModuleMetaNode(String groupName,
            String groupOid, ObjectName groupObjname, MBeanServer server) {
        return new OdlCardinalBundleActiveModuleMeta(this, objectserver);
    }

    /**
     * Factory method for "OdlCardinalBundleActiveModule" group MBean.
     * 
     * You can redefine this method if you need to replace the default generated
     * MBean class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalBundleActiveModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the MBean class generated for the
     *         "OdlCardinalBundleActiveModule" group
     *         (OdlCardinalBundleActiveModule)
     * 
     *         Note that when using standard metadata, the returned object must
     *         implement the "OdlCardinalBundleActiveModuleMBean" interface.
     **/
    protected Object createOdlCardinalBundleActiveModuleMBean(String groupName, String groupOid,
            ObjectName groupObjname, MBeanServer server) {

        // Note that when using standard metadata,
        // the returned object must implement the
        // "OdlCardinalBundleActiveModuleMBean"
        // interface.
        //
        if (server != null)
            return new OdlCardinalBundleActiveModule(this, server);
        else
            return new OdlCardinalBundleActiveModule(this);
    }

    // ------------------------------------------------------------
    //
    // Initialization of the "OdlCardinalFeatureUnInstalModule" group.
    //
    // ------------------------------------------------------------

    /**
     * Initialization of the "OdlCardinalFeatureUnInstalModule" group.
     * 
     * To disable support of this group, redefine the
     * "createOdlCardinalFeatureUnInstalModuleMetaNode()" factory method, and
     * make it return "null"
     * 
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     **/
    protected void initOdlCardinalFeatureUnInstalModule(MBeanServer server) throws Exception {
        final String oid = getGroupOid("OdlCardinalFeatureUnInstalModule", "1.3.6.1.3.1.1.3");
        ObjectName objname = null;
        if (server != null) {
            objname = getGroupObjectName("OdlCardinalFeatureUnInstalModule", oid,
                    mibName + ":name=OdlCardinalFeatureUnInstalModule");
        }
        final OdlCardinalFeatureUnInstalModuleMeta meta = createOdlCardinalFeatureUnInstalModuleMetaNode(
                "OdlCardinalFeatureUnInstalModule", oid, objname, server);
        if (meta != null) {
            meta.registerTableNodes(this, server);

            // Note that when using standard metadata,
            // the returned object must implement the
            // "OdlCardinalFeatureUnInstalModuleMBean"
            // interface.
            //
            final OdlCardinalFeatureUnInstalModuleMBean group = (OdlCardinalFeatureUnInstalModuleMBean) createOdlCardinalFeatureUnInstalModuleMBean(
                    "OdlCardinalFeatureUnInstalModule", oid, objname, server);
            meta.setInstance(group);
            registerGroupNode("OdlCardinalFeatureUnInstalModule", oid, objname, meta, group, server);
        }
    }

    /**
     * Factory method for "OdlCardinalFeatureUnInstalModule" group metadata
     * class.
     * 
     * You can redefine this method if you need to replace the default generated
     * metadata class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalFeatureUnInstalModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the metadata class generated for the
     *         "OdlCardinalFeatureUnInstalModule" group
     *         (OdlCardinalFeatureUnInstalModuleMeta)
     * 
     **/
    protected OdlCardinalFeatureUnInstalModuleMeta createOdlCardinalFeatureUnInstalModuleMetaNode(String groupName,
            String groupOid, ObjectName groupObjname, MBeanServer server) {
        return new OdlCardinalFeatureUnInstalModuleMeta(this, objectserver);
    }

    /**
     * Factory method for "OdlCardinalFeatureUnInstalModule" group MBean.
     * 
     * You can redefine this method if you need to replace the default generated
     * MBean class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalFeatureUnInstalModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the MBean class generated for the
     *         "OdlCardinalFeatureUnInstalModule" group
     *         (OdlCardinalFeatureUnInstalModule)
     * 
     *         Note that when using standard metadata, the returned object must
     *         implement the "OdlCardinalFeatureUnInstalModuleMBean" interface.
     **/
    protected Object createOdlCardinalFeatureUnInstalModuleMBean(String groupName, String groupOid,
            ObjectName groupObjname, MBeanServer server) {

        // Note that when using standard metadata,
        // the returned object must implement the
        // "OdlCardinalFeatureUnInstalModuleMBean"
        // interface.
        //
        if (server != null)
            return new OdlCardinalFeatureUnInstalModule(this, server);
        else
            return new OdlCardinalFeatureUnInstalModule(this);
    }

    // ------------------------------------------------------------
    //
    // Initialization of the "OdlCardinalFeatureInstallModule" group.
    //
    // ------------------------------------------------------------

    /**
     * Initialization of the "OdlCardinalFeatureInstallModule" group.
     * 
     * To disable support of this group, redefine the
     * "createOdlCardinalFeatureInstallModuleMetaNode()" factory method, and
     * make it return "null"
     * 
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     **/
    protected void initOdlCardinalFeatureInstallModule(MBeanServer server) throws Exception {
        final String oid = getGroupOid("OdlCardinalFeatureInstallModule", "1.3.6.1.3.1.1.2");
        ObjectName objname = null;
        if (server != null) {
            objname = getGroupObjectName("OdlCardinalFeatureInstallModule", oid,
                    mibName + ":name=OdlCardinalFeatureInstallModule");
        }
        final OdlCardinalFeatureInstallModuleMeta meta = createOdlCardinalFeatureInstallModuleMetaNode(
                "OdlCardinalFeatureInstallModule", oid, objname, server);
        if (meta != null) {
            meta.registerTableNodes(this, server);

            // Note that when using standard metadata,
            // the returned object must implement the
            // "OdlCardinalFeatureInstallModuleMBean"
            // interface.
            //
            final OdlCardinalFeatureInstallModuleMBean group = (OdlCardinalFeatureInstallModuleMBean) createOdlCardinalFeatureInstallModuleMBean(
                    "OdlCardinalFeatureInstallModule", oid, objname, server);
            meta.setInstance(group);
            registerGroupNode("OdlCardinalFeatureInstallModule", oid, objname, meta, group, server);
        }
    }

    /**
     * Factory method for "OdlCardinalFeatureInstallModule" group metadata
     * class.
     * 
     * You can redefine this method if you need to replace the default generated
     * metadata class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalFeatureInstallModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the metadata class generated for the
     *         "OdlCardinalFeatureInstallModule" group
     *         (OdlCardinalFeatureInstallModuleMeta)
     * 
     **/
    protected OdlCardinalFeatureInstallModuleMeta createOdlCardinalFeatureInstallModuleMetaNode(String groupName,
            String groupOid, ObjectName groupObjname, MBeanServer server) {
        return new OdlCardinalFeatureInstallModuleMeta(this, objectserver);
    }

    /**
     * Factory method for "OdlCardinalFeatureInstallModule" group MBean.
     * 
     * You can redefine this method if you need to replace the default generated
     * MBean class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalFeatureInstallModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the MBean class generated for the
     *         "OdlCardinalFeatureInstallModule" group
     *         (OdlCardinalFeatureInstallModule)
     * 
     *         Note that when using standard metadata, the returned object must
     *         implement the "OdlCardinalFeatureInstallModuleMBean" interface.
     **/
    protected Object createOdlCardinalFeatureInstallModuleMBean(String groupName, String groupOid,
            ObjectName groupObjname, MBeanServer server) {

        // Note that when using standard metadata,
        // the returned object must implement the
        // "OdlCardinalFeatureInstallModuleMBean"
        // interface.
        //
        if (server != null)
            return new OdlCardinalFeatureInstallModule(this, server);
        else
            return new OdlCardinalFeatureInstallModule(this);
    }

    // ------------------------------------------------------------
    //
    // Initialization of the "OdlCardinalMainModule" group.
    //
    // ------------------------------------------------------------

    /**
     * Initialization of the "OdlCardinalMainModule" group.
     * 
     * To disable support of this group, redefine the
     * "createOdlCardinalMainModuleMetaNode()" factory method, and make it
     * return "null"
     * 
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     **/
    protected void initOdlCardinalMainModule(MBeanServer server) throws Exception {
        final String oid = getGroupOid("OdlCardinalMainModule", "1.3.6.1.3.1.1.1");
        ObjectName objname = null;
        if (server != null) {
            objname = getGroupObjectName("OdlCardinalMainModule", oid, mibName + ":name=OdlCardinalMainModule");
        }
        final OdlCardinalMainModuleMeta meta = createOdlCardinalMainModuleMetaNode("OdlCardinalMainModule", oid,
                objname, server);
        if (meta != null) {
            meta.registerTableNodes(this, server);

            // Note that when using standard metadata,
            // the returned object must implement the
            // "OdlCardinalMainModuleMBean"
            // interface.
            //
            final OdlCardinalMainModuleMBean group = (OdlCardinalMainModuleMBean) createOdlCardinalMainModuleMBean(
                    "OdlCardinalMainModule", oid, objname, server);
            meta.setInstance(group);
            registerGroupNode("OdlCardinalMainModule", oid, objname, meta, group, server);
        }
    }

    /**
     * Factory method for "OdlCardinalMainModule" group metadata class.
     * 
     * You can redefine this method if you need to replace the default generated
     * metadata class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalMainModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the metadata class generated for the
     *         "OdlCardinalMainModule" group (OdlCardinalMainModuleMeta)
     * 
     **/
    protected OdlCardinalMainModuleMeta createOdlCardinalMainModuleMetaNode(String groupName, String groupOid,
            ObjectName groupObjname, MBeanServer server) {
        return new OdlCardinalMainModuleMeta(this, objectserver);
    }

    /**
     * Factory method for "OdlCardinalMainModule" group MBean.
     * 
     * You can redefine this method if you need to replace the default generated
     * MBean class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalMainModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the MBean class generated for the
     *         "OdlCardinalMainModule" group (OdlCardinalMainModule)
     * 
     *         Note that when using standard metadata, the returned object must
     *         implement the "OdlCardinalMainModuleMBean" interface.
     **/
    protected Object createOdlCardinalMainModuleMBean(String groupName, String groupOid, ObjectName groupObjname,
            MBeanServer server) {

        // Note that when using standard metadata,
        // the returned object must implement the "OdlCardinalMainModuleMBean"
        // interface.
        //
        if (server != null)
            return new OdlCardinalMainModule(this, server);
        else
            return new OdlCardinalMainModule(this);
    }

    // ------------------------------------------------------------
    //
    // Initialization of the "OdlCardinalProjectModule" group.
    //
    // ------------------------------------------------------------

    /**
     * Initialization of the "OdlCardinalProjectModule" group.
     * 
     * To disable support of this group, redefine the
     * "createOdlCardinalProjectModuleMetaNode()" factory method, and make it
     * return "null"
     * 
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     **/
    protected void initOdlCardinalProjectModule(MBeanServer server) throws Exception {
        final String oid = getGroupOid("OdlCardinalProjectModule", "1.3.6.1.3.1.1.8");
        ObjectName objname = null;
        if (server != null) {
            objname = getGroupObjectName("OdlCardinalProjectModule", oid, mibName + ":name=OdlCardinalProjectModule");
        }
        final OdlCardinalProjectModuleMeta meta = createOdlCardinalProjectModuleMetaNode("OdlCardinalProjectModule",
                oid, objname, server);
        if (meta != null) {
            meta.registerTableNodes(this, server);

            // Note that when using standard metadata,
            // the returned object must implement the
            // "OdlCardinalProjectModuleMBean"
            // interface.
            //
            final OdlCardinalProjectModuleMBean group = (OdlCardinalProjectModuleMBean) createOdlCardinalProjectModuleMBean(
                    "OdlCardinalProjectModule", oid, objname, server);
            meta.setInstance(group);
            registerGroupNode("OdlCardinalProjectModule", oid, objname, meta, group, server);
        }
    }

    /**
     * Factory method for "OdlCardinalProjectModule" group metadata class.
     * 
     * You can redefine this method if you need to replace the default generated
     * metadata class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalProjectModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the metadata class generated for the
     *         "OdlCardinalProjectModule" group (OdlCardinalProjectModuleMeta)
     * 
     **/
    protected OdlCardinalProjectModuleMeta createOdlCardinalProjectModuleMetaNode(String groupName, String groupOid,
            ObjectName groupObjname, MBeanServer server) {
        return new OdlCardinalProjectModuleMeta(this, objectserver);
    }

    /**
     * Factory method for "OdlCardinalProjectModule" group MBean.
     * 
     * You can redefine this method if you need to replace the default generated
     * MBean class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalProjectModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the MBean class generated for the
     *         "OdlCardinalProjectModule" group (OdlCardinalProjectModule)
     * 
     *         Note that when using standard metadata, the returned object must
     *         implement the "OdlCardinalProjectModuleMBean" interface.
     **/
    protected Object createOdlCardinalProjectModuleMBean(String groupName, String groupOid, ObjectName groupObjname,
            MBeanServer server) {

        // Note that when using standard metadata,
        // the returned object must implement the
        // "OdlCardinalProjectModuleMBean"
        // interface.
        //
        if (server != null)
            return new OdlCardinalProjectModule(this, server);
        else
            return new OdlCardinalProjectModule(this);
    }

    // ------------------------------------------------------------
    //
    // Initialization of the "OdlCardinalKarafShellModule" group.
    //
    // ------------------------------------------------------------

    /**
     * Initialization of the "OdlCardinalKarafShellModule" group.
     * 
     * To disable support of this group, redefine the
     * "createOdlCardinalKarafShellModuleMetaNode()" factory method, and make it
     * return "null"
     * 
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     **/
    protected void initOdlCardinalKarafShellModule(MBeanServer server) throws Exception {
        final String oid = getGroupOid("OdlCardinalKarafShellModule", "1.3.6.1.3.1.1.7");
        ObjectName objname = null;
        if (server != null) {
            objname = getGroupObjectName("OdlCardinalKarafShellModule", oid,
                    mibName + ":name=OdlCardinalKarafShellModule");
        }
        final OdlCardinalKarafShellModuleMeta meta = createOdlCardinalKarafShellModuleMetaNode(
                "OdlCardinalKarafShellModule", oid, objname, server);
        if (meta != null) {
            meta.registerTableNodes(this, server);

            // Note that when using standard metadata,
            // the returned object must implement the
            // "OdlCardinalKarafShellModuleMBean"
            // interface.
            //
            final OdlCardinalKarafShellModuleMBean group = (OdlCardinalKarafShellModuleMBean) createOdlCardinalKarafShellModuleMBean(
                    "OdlCardinalKarafShellModule", oid, objname, server);
            meta.setInstance(group);
            registerGroupNode("OdlCardinalKarafShellModule", oid, objname, meta, group, server);
        }
    }

    /**
     * Factory method for "OdlCardinalKarafShellModule" group metadata class.
     * 
     * You can redefine this method if you need to replace the default generated
     * metadata class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalKarafShellModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the metadata class generated for the
     *         "OdlCardinalKarafShellModule" group
     *         (OdlCardinalKarafShellModuleMeta)
     * 
     **/
    protected OdlCardinalKarafShellModuleMeta createOdlCardinalKarafShellModuleMetaNode(String groupName,
            String groupOid, ObjectName groupObjname, MBeanServer server) {
        return new OdlCardinalKarafShellModuleMeta(this, objectserver);
    }

    /**
     * Factory method for "OdlCardinalKarafShellModule" group MBean.
     * 
     * You can redefine this method if you need to replace the default generated
     * MBean class with your own customized class.
     * 
     * @param groupName
     *            Name of the group ("OdlCardinalKarafShellModule")
     * @param groupOid
     *            OID of this group
     * @param groupObjname
     *            ObjectName for this group (may be null)
     * @param server
     *            MBeanServer for this group (may be null)
     * 
     * @return An instance of the MBean class generated for the
     *         "OdlCardinalKarafShellModule" group (OdlCardinalKarafShellModule)
     * 
     *         Note that when using standard metadata, the returned object must
     *         implement the "OdlCardinalKarafShellModuleMBean" interface.
     **/
    protected Object createOdlCardinalKarafShellModuleMBean(String groupName, String groupOid, ObjectName groupObjname,
            MBeanServer server) {

        // Note that when using standard metadata,
        // the returned object must implement the
        // "OdlCardinalKarafShellModuleMBean"
        // interface.
        //
        if (server != null)
            return new OdlCardinalKarafShellModule(this, server);
        else
            return new OdlCardinalKarafShellModule(this);
    }

    // ------------------------------------------------------------
    //
    // Implements the "registerTableMeta" method defined in "SnmpMib".
    // See the "SnmpMib" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public void registerTableMeta(String name, SnmpMibTable meta) {
        if (metadatas == null)
            return;
        if (name == null)
            return;
        metadatas.put(name, meta);
    }

    // ------------------------------------------------------------
    //
    // Implements the "getRegisteredTableMeta" method defined in "SnmpMib".
    // See the "SnmpMib" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public SnmpMibTable getRegisteredTableMeta(String name) {
        if (metadatas == null)
            return null;
        if (name == null)
            return null;
        return (SnmpMibTable) metadatas.get(name);
    }

    public SnmpStandardObjectServer getStandardObjectServer() {
        if (objectserver == null)
            objectserver = new SnmpStandardObjectServer();
        return objectserver;
    }

    private boolean isInitialized = false;

    protected SnmpStandardObjectServer objectserver;

    protected final Hashtable metadatas = new Hashtable();
}
