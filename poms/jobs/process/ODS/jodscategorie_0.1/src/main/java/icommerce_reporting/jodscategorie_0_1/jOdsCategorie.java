
package icommerce_reporting.jodscategorie_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.SQLike;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 




	//the import part of tJava_1
	//import java.util.List;

	//the import part of tJava_2
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: jOdsCategorie Purpose: Alimenter la table ODS_CATEGORIE<br>
 * Description: Alimenter la table ODS_CATEGORIE <br>
 * @author halid.do-rego@kpsgroupe.com
 * @version 8.0.1.20220923_1236-patch
 * @status 
 */
public class jOdsCategorie implements TalendJob {
	static {System.setProperty("TalendJob.log", "jOdsCategorie.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(jOdsCategorie.class);
	

protected static void logIgnoredError(String message, Throwable cause) {
       log.error(message, cause);

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(schema_ods != null){
				
					this.setProperty("schema_ods", schema_ods.toString());
				
			}
			
			if(additionalParam != null){
				
					this.setProperty("additionalParam", additionalParam.toString());
				
			}
			
			if(database != null){
				
					this.setProperty("database", database.toString());
				
			}
			
			if(password != null){
				
					this.setProperty("password", password.toString());
				
			}
			
			if(port != null){
				
					this.setProperty("port", port.toString());
				
			}
			
			if(schema_param != null){
				
					this.setProperty("schema_param", schema_param.toString());
				
			}
			
			if(serverName != null){
				
					this.setProperty("serverName", serverName.toString());
				
			}
			
			if(utilisateur != null){
				
					this.setProperty("utilisateur", utilisateur.toString());
				
			}
			
			if(encodage != null){
				
					this.setProperty("encodage", encodage.toString());
				
			}
			
			if(fieldSeparator != null){
				
					this.setProperty("fieldSeparator", fieldSeparator.toString());
				
			}
			
			if(projectFolder != null){
				
					this.setProperty("projectFolder", projectFolder.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String schema_ods;
public String getSchema_ods(){
	return this.schema_ods;
}
public String additionalParam;
public String getAdditionalParam(){
	return this.additionalParam;
}
public String database;
public String getDatabase(){
	return this.database;
}
public String password;
public String getPassword(){
	return this.password;
}
public String port;
public String getPort(){
	return this.port;
}
public String schema_param;
public String getSchema_param(){
	return this.schema_param;
}
public String serverName;
public String getServerName(){
	return this.serverName;
}
public String utilisateur;
public String getUtilisateur(){
	return this.utilisateur;
}
public String encodage;
public String getEncodage(){
	return this.encodage;
}
public String fieldSeparator;
public String getFieldSeparator(){
	return this.fieldSeparator;
}
		public String projectFolder;
		public String getProjectFolder(){
			return this.projectFolder;
		}
		
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "jOdsCategorie";
	private final String projectName = "ICOMMERCE_REPORTING";
	public Integer errorCode = null;
	private String currentComponent = "";
	
	private String cLabel =  null;
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_iUWBUCoJEe62wqBezdUyXw", "0.1");
private org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

private RunStat runStat = new RunStat(talendJobLog, System.getProperty("audit.interval"));

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	
	private String currentComponent = null;
	private String cLabel =  null;
	
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}
	
	private TalendException(Exception e, String errorComponent, String errorComponentLabel, final java.util.Map<String, Object> globalMap) {
		this(e, errorComponent, globalMap);
		this.cLabel = errorComponentLabel;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				jOdsCategorie.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(jOdsCategorie.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
		if(enableLogStash) {
			talendJobLog.addJobExceptionMessage(currentComponent, cLabel, null, e);
			talendJobLogProcess(globalMap);
		}
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void Implicit_Context_Database_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							Implicit_Context_Context_error(exception, errorComponent, globalMap);
						
						}
					
			public void Implicit_Context_Context_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					Implicit_Context_Database_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStart_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStart_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSetGlobalVar_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileList_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
						try {
							
								if(this.execStat){
									runStat.updateStatOnConnection("OnComponentError1", 0, "error");
								}
							
							
								errorCode = null;
								tDie_1Process(globalMap);
								if (!"failure".equals(status)) {
									status = "end";
								}
								

						} catch (Exception e) {
							e.printStackTrace();
						}
						
					tFileList_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFilterRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tUniqRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBCommit_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStop_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStop_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void Implicit_Context_Database_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSetGlobalVar_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileList_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	



public static class row_Implicit_Context_DatabaseStruct implements routines.system.IPersistableRow<row_Implicit_Context_DatabaseStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];

	
			    public String key;

				public String getKey () {
					return this.key;
				}

				public Boolean keyIsNullable(){
				    return true;
				}
				public Boolean keyIsKey(){
				    return false;
				}
				public Integer keyLength(){
				    return 255;
				}
				public Integer keyPrecision(){
				    return 0;
				}
				public String keyDefault(){
				
					return "";
				
				}
				public String keyComment(){
				
				    return null;
				
				}
				public String keyPattern(){
				
				    return null;
				
				}
				public String keyOriginalDbColumnName(){
				
					return "key";
				
				}

				
			    public String value;

				public String getValue () {
					return this.value;
				}

				public Boolean valueIsNullable(){
				    return true;
				}
				public Boolean valueIsKey(){
				    return false;
				}
				public Integer valueLength(){
				    return 255;
				}
				public Integer valuePrecision(){
				    return 0;
				}
				public String valueDefault(){
				
					return "";
				
				}
				public String valueComment(){
				
				    return null;
				
				}
				public String valuePattern(){
				
				    return null;
				
				}
				public String valueOriginalDbColumnName(){
				
					return "value";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("key="+key);
		sb.append(",value="+value);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(key == null){
        					sb.append("<null>");
        				}else{
            				sb.append(key);
            			}
            		
        			sb.append("|");
        		
        				if(value == null){
        					sb.append("<null>");
        				}else{
            				sb.append(value);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row_Implicit_Context_DatabaseStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void Implicit_Context_DatabaseProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "Implicit_Context_Database");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_Implicit_Context_DatabaseStruct row_Implicit_Context_Database = new row_Implicit_Context_DatabaseStruct();




	
	/**
	 * [Implicit_Context_Context begin ] start
	 */

	

	
		
		ok_Hash.put("Implicit_Context_Context", false);
		start_Hash.put("Implicit_Context_Context", System.currentTimeMillis());
		
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Main");
			
		int tos_count_Implicit_Context_Context = 0;
		
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Context - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_Implicit_Context_Context{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_Implicit_Context_Context = new StringBuilder();
                    log4jParamters_Implicit_Context_Context.append("Parameters:");
                            log4jParamters_Implicit_Context_Context.append("LOAD_NEW_VARIABLE" + " = " + "Info");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("NOT_LOAD_OLD_VARIABLE" + " = " + "Warning");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("PRINT_OPERATIONS" + " = " + "false");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("DISABLE_ERROR" + " = " + "false");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("DISABLE_WARNINGS" + " = " + "false");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("DISABLE_INFO" + " = " + "true");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("DIEONERROR" + " = " + "false");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Context - "  + (log4jParamters_Implicit_Context_Context) );
                    } 
                } 
            new BytesLimit65535_Implicit_Context_Context().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("Implicit_Context_Context", "null_Context", "tContextLoad");
				talendJobLogProcess(globalMap);
			}
			
	java.util.List<String> assignList_Implicit_Context_Context = new java.util.ArrayList<String>();
	java.util.List<String> newPropertyList_Implicit_Context_Context = new java.util.ArrayList<String>();
	java.util.List<String> noAssignList_Implicit_Context_Context = new java.util.ArrayList<String>();
	int nb_line_Implicit_Context_Context = 0;

 



/**
 * [Implicit_Context_Context begin ] stop
 */



	
	/**
	 * [Implicit_Context_Database begin ] start
	 */

	

	
		
		ok_Hash.put("Implicit_Context_Database", false);
		start_Hash.put("Implicit_Context_Database", System.currentTimeMillis());
		
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";
	
	
		int tos_count_Implicit_Context_Database = 0;
		
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Database - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_Implicit_Context_Database{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_Implicit_Context_Database = new StringBuilder();
                    log4jParamters_Implicit_Context_Database.append("Parameters:");
                            log4jParamters_Implicit_Context_Database.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("DB_VERSION" + " = " + "V9_X");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("HOST" + " = " + "context.serverName");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("PORT" + " = " + "context.port");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("DBNAME" + " = " + "context.database");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("SCHEMA_DB" + " = " + "context.schema_param");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("USER" + " = " + "context.utilisateur");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.password)).substring(0, 4) + "...");     
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("QUERY" + " = " + "\"SELECT    \\\"\"+context.schema_param+\"\\\".\\\"CONTEXTE\\\".\\\"key\\\",    \\\"\"+context.schema_param+\"\\\".\\\"CONTEXTE\\\".\\\"value\\\" FROM \\\"\"+context.schema_param+\"\\\".\\\"CONTEXTE\\\"\"");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("PROPERTIES" + " = " + "context.additionalParam");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                            log4jParamters_Implicit_Context_Database.append("TRIM_COLUMN" + " = " + "[]");
                        log4jParamters_Implicit_Context_Database.append(" | ");
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Database - "  + (log4jParamters_Implicit_Context_Database) );
                    } 
                } 
            new BytesLimit65535_Implicit_Context_Database().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("Implicit_Context_Database", "null_Database", "tPostgresqlInput");
				talendJobLogProcess(globalMap);
			}
			
	
    
	
		    int nb_line_Implicit_Context_Database = 0;
		    java.sql.Connection conn_Implicit_Context_Database = null;
				String driverClass_Implicit_Context_Database = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_Implicit_Context_Database = java.lang.Class.forName(driverClass_Implicit_Context_Database);
				String dbUser_Implicit_Context_Database = context.utilisateur;
				
				
	final String decryptedPassword_Implicit_Context_Database = context.password; 
				
				String dbPwd_Implicit_Context_Database = decryptedPassword_Implicit_Context_Database;
				
				String url_Implicit_Context_Database = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/" + context.database + "?" + context.additionalParam;
				
	    		log.debug("Implicit_Context_Database - Driver ClassName: "+driverClass_Implicit_Context_Database+".");
			
	    		log.debug("Implicit_Context_Database - Connection attempt to '" + url_Implicit_Context_Database + "' with the username '" + dbUser_Implicit_Context_Database + "'.");
			
				conn_Implicit_Context_Database = java.sql.DriverManager.getConnection(url_Implicit_Context_Database,dbUser_Implicit_Context_Database,dbPwd_Implicit_Context_Database);
	    		log.debug("Implicit_Context_Database - Connection to '" + url_Implicit_Context_Database + "' has succeeded.");
			
		        
	    		log.debug("Implicit_Context_Database - Connection is set auto commit to 'false'.");
			
				conn_Implicit_Context_Database.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_Implicit_Context_Database = conn_Implicit_Context_Database.createStatement();

		    String dbquery_Implicit_Context_Database = "SELECT \n  \""+context.schema_param+"\".\"CONTEXTE\".\"key\", \n  \""+context.schema_param+"\".\"CONTEXTE\".\"value\"\nFROM \""+context.schema_param+"\".\"CONTEXTE\"";
		    
	    		log.debug("Implicit_Context_Database - Executing the query: '" + dbquery_Implicit_Context_Database + "'.");
			

            	globalMap.put("Implicit_Context_Database_QUERY",dbquery_Implicit_Context_Database);
		    java.sql.ResultSet rs_Implicit_Context_Database = null;

		    try {
		    	rs_Implicit_Context_Database = stmt_Implicit_Context_Database.executeQuery(dbquery_Implicit_Context_Database);
		    	java.sql.ResultSetMetaData rsmd_Implicit_Context_Database = rs_Implicit_Context_Database.getMetaData();
		    	int colQtyInRs_Implicit_Context_Database = rsmd_Implicit_Context_Database.getColumnCount();

		    String tmpContent_Implicit_Context_Database = null;
		    
		    
		    	log.debug("Implicit_Context_Database - Retrieving records from the database.");
		    
		    while (rs_Implicit_Context_Database.next()) {
		        nb_line_Implicit_Context_Database++;
		        
							if(colQtyInRs_Implicit_Context_Database < 1) {
								row_Implicit_Context_Database.key = null;
							} else {
	                         		
        	row_Implicit_Context_Database.key = routines.system.JDBCUtil.getString(rs_Implicit_Context_Database, 1, false);
		                    }
							if(colQtyInRs_Implicit_Context_Database < 2) {
								row_Implicit_Context_Database.value = null;
							} else {
	                         		
        	row_Implicit_Context_Database.value = routines.system.JDBCUtil.getString(rs_Implicit_Context_Database, 2, false);
		                    }
					
						log.debug("Implicit_Context_Database - Retrieving the record " + nb_line_Implicit_Context_Database + ".");
					


 



/**
 * [Implicit_Context_Database begin ] stop
 */
	
	/**
	 * [Implicit_Context_Database main ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";
	
	

 


	tos_count_Implicit_Context_Database++;

/**
 * [Implicit_Context_Database main ] stop
 */
	
	/**
	 * [Implicit_Context_Database process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";
	
	

 



/**
 * [Implicit_Context_Database process_data_begin ] stop
 */

	
	/**
	 * [Implicit_Context_Context main ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"Main","Implicit_Context_Database","null_Database","tPostgresqlInput","Implicit_Context_Context","null_Context","tContextLoad"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
        //////////////////////////
        String tmp_key_Implicit_Context_Context = null;
                    String key_Implicit_Context_Context = null;
                      if (row_Implicit_Context_Database.key != null){
                          tmp_key_Implicit_Context_Context = row_Implicit_Context_Database.key.trim();
                        if ((tmp_key_Implicit_Context_Context.startsWith("#") || tmp_key_Implicit_Context_Context.startsWith("!") )){
                          tmp_key_Implicit_Context_Context = null;
                        } else {
                          row_Implicit_Context_Database.key = tmp_key_Implicit_Context_Context;
                        }
                      }
                        if(row_Implicit_Context_Database.key != null) {
                    key_Implicit_Context_Context =
                        row_Implicit_Context_Database.key;
                        }
                    String value_Implicit_Context_Context = null;
                        if(row_Implicit_Context_Database.value != null) {
                    value_Implicit_Context_Context =
                        row_Implicit_Context_Database.value;
                        }
				
				String currentValue_Implicit_Context_Context = value_Implicit_Context_Context;
				

  if (tmp_key_Implicit_Context_Context != null){
  try{
        if(key_Implicit_Context_Context!=null && "schema_ods".equals(key_Implicit_Context_Context))
        {
           context.schema_ods=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "additionalParam".equals(key_Implicit_Context_Context))
        {
           context.additionalParam=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "database".equals(key_Implicit_Context_Context))
        {
           context.database=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "password".equals(key_Implicit_Context_Context))
        {
           context.password=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "port".equals(key_Implicit_Context_Context))
        {
           context.port=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "schema_param".equals(key_Implicit_Context_Context))
        {
           context.schema_param=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "serverName".equals(key_Implicit_Context_Context))
        {
           context.serverName=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "utilisateur".equals(key_Implicit_Context_Context))
        {
           context.utilisateur=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "encodage".equals(key_Implicit_Context_Context))
        {
           context.encodage=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "fieldSeparator".equals(key_Implicit_Context_Context))
        {
           context.fieldSeparator=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "projectFolder".equals(key_Implicit_Context_Context))
        {
           context.projectFolder=value_Implicit_Context_Context;
        }


        if (context.getProperty(key_Implicit_Context_Context)!=null)
        {
            assignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }else  {
            newPropertyList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }
        if(value_Implicit_Context_Context == null){
            context.setProperty(key_Implicit_Context_Context, "");
        }else{
            context.setProperty(key_Implicit_Context_Context,value_Implicit_Context_Context);
        }
    }catch(java.lang.Exception e){
globalMap.put("Implicit_Context_Context_ERROR_MESSAGE",e.getMessage());
            log.error("Implicit_Context_Context - Setting a value for the key \"" + key_Implicit_Context_Context + "\" has failed. Error message: " + e.getMessage());
        System.err.println("Setting a value for the key \"" + key_Implicit_Context_Context + "\" has failed. Error message: " + e.getMessage());
    }
        nb_line_Implicit_Context_Context++;
    }
        //////////////////////////

 


	tos_count_Implicit_Context_Context++;

/**
 * [Implicit_Context_Context main ] stop
 */
	
	/**
	 * [Implicit_Context_Context process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";
	
	

 



/**
 * [Implicit_Context_Context process_data_begin ] stop
 */
	
	/**
	 * [Implicit_Context_Context process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";
	
	

 



/**
 * [Implicit_Context_Context process_data_end ] stop
 */



	
	/**
	 * [Implicit_Context_Database process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";
	
	

 



/**
 * [Implicit_Context_Database process_data_end ] stop
 */
	
	/**
	 * [Implicit_Context_Database end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";
	
	

	}
}finally{
	if (rs_Implicit_Context_Database != null) {
		rs_Implicit_Context_Database.close();
	}
	if (stmt_Implicit_Context_Database != null) {
		stmt_Implicit_Context_Database.close();
	}
	if(conn_Implicit_Context_Database != null && !conn_Implicit_Context_Database.isClosed()) {
		
	    		log.debug("Implicit_Context_Database - Connection starting to commit.");
			
			conn_Implicit_Context_Database.commit();
			
	    		log.debug("Implicit_Context_Database - Connection commit has succeeded.");
			
		
	    		log.debug("Implicit_Context_Database - Closing the connection to the database.");
			
			conn_Implicit_Context_Database.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("Implicit_Context_Database - Connection to the database closed.");
			
	}
	
}
globalMap.put("Implicit_Context_Database_NB_LINE",nb_line_Implicit_Context_Database);
	    		log.debug("Implicit_Context_Database - Retrieved records count: "+nb_line_Implicit_Context_Database + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Database - "  + ("Done.") );

ok_Hash.put("Implicit_Context_Database", true);
end_Hash.put("Implicit_Context_Database", System.currentTimeMillis());




/**
 * [Implicit_Context_Database end ] stop
 */

	
	/**
	 * [Implicit_Context_Context end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";
	
	
	
	java.util.Enumeration<?> enu_Implicit_Context_Context = context.propertyNames();
    while(enu_Implicit_Context_Context.hasMoreElements())
    {           
    	String key_Implicit_Context_Context = (String)enu_Implicit_Context_Context.nextElement();
        if(!assignList_Implicit_Context_Context.contains(key_Implicit_Context_Context) && !newPropertyList_Implicit_Context_Context.contains(key_Implicit_Context_Context))
        {
            noAssignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }          
    }
	for(Object obj_Implicit_Context_Context :noAssignList_Implicit_Context_Context){
		
			String oldLog_Implicit_Context_Context = "Implicit_Context_Context: Parameter \"" + obj_Implicit_Context_Context + "\" has not been set by Implicit_Context_Context";
			
				log.warn(oldLog_Implicit_Context_Context);
			
		
		System.out.println("Warning: Parameter \"" + obj_Implicit_Context_Context + "\" has not been set by Implicit_Context_Context");
		
	} 

    String newPropertyStr_Implicit_Context_Context = newPropertyList_Implicit_Context_Context.toString();
    String newProperty_Implicit_Context_Context = newPropertyStr_Implicit_Context_Context.substring(1, newPropertyStr_Implicit_Context_Context.length() - 1);
    
    String noAssignStr_Implicit_Context_Context = noAssignList_Implicit_Context_Context.toString();
    String noAssign_Implicit_Context_Context = noAssignStr_Implicit_Context_Context.substring(1, noAssignStr_Implicit_Context_Context.length() - 1);
    
    globalMap.put("Implicit_Context_Context_KEY_NOT_INCONTEXT", newProperty_Implicit_Context_Context);
    globalMap.put("Implicit_Context_Context_KEY_NOT_LOADED", noAssign_Implicit_Context_Context);

    globalMap.put("Implicit_Context_Context_NB_LINE",nb_line_Implicit_Context_Context);

	List<String> parametersToEncrypt_Implicit_Context_Context = new java.util.ArrayList<String>();
	
	
	resumeUtil.addLog("NODE", "NODE:Implicit_Context_Context", "", Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,ContextProperties.class,parametersToEncrypt_Implicit_Context_Context));    
    	log.info("Implicit_Context_Context - Loaded contexts count: " + nb_line_Implicit_Context_Context + ".");
    
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Main",2,0,
			 			"Implicit_Context_Database","null_Database","tPostgresqlInput","Implicit_Context_Context","null_Context","tContextLoad","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Context - "  + ("Done.") );

ok_Hash.put("Implicit_Context_Context", true);
end_Hash.put("Implicit_Context_Context", System.currentTimeMillis());




/**
 * [Implicit_Context_Context end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [Implicit_Context_Database finally ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";
	
	

 



/**
 * [Implicit_Context_Database finally ] stop
 */

	
	/**
	 * [Implicit_Context_Context finally ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";
	
	

 



/**
 * [Implicit_Context_Context finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", 1);
	}
	

public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tPrejob_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";
	
	
		int tos_count_tPrejob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPrejob_1", "tPrejob_1", "tPrejob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tChronometerStart_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}
	

public void tChronometerStart_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tChronometerStart_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tChronometerStart_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStart_1", false);
		start_Hash.put("tChronometerStart_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStart_1";
	
	
			cLabel="     D\u00E9but d'ex\u00E9cution<br><b>tChronometerStart_1</b>";
		
		int tos_count_tChronometerStart_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tChronometerStart_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tChronometerStart_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tChronometerStart_1 = new StringBuilder();
                    log4jParamters_tChronometerStart_1.append("Parameters:");
                if(log.isDebugEnabled())
            log.debug("tChronometerStart_1 - "  + (log4jParamters_tChronometerStart_1) );
                    } 
                } 
            new BytesLimit65535_tChronometerStart_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tChronometerStart_1", "     D\u00E9but d'ex\u00E9cution<br><b>tChronometerStart_1</b>", "tChronometerStart");
				talendJobLogProcess(globalMap);
			}
			

	
	
	Long currentTimetChronometerStart_1 = System.currentTimeMillis();
	
		log.info("tChronometerStart_1 - Start time: "+currentTimetChronometerStart_1+" milliseconds");
	
	globalMap.put("tChronometerStart_1",currentTimetChronometerStart_1);
	globalMap.put("tChronometerStart_1_STARTTIME", currentTimetChronometerStart_1);
 



/**
 * [tChronometerStart_1 begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";
	
	
			cLabel="     D\u00E9but d'ex\u00E9cution<br><b>tChronometerStart_1</b>";
		

 


	tos_count_tChronometerStart_1++;

/**
 * [tChronometerStart_1 main ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";
	
	
			cLabel="     D\u00E9but d'ex\u00E9cution<br><b>tChronometerStart_1</b>";
		

 



/**
 * [tChronometerStart_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";
	
	
			cLabel="     D\u00E9but d'ex\u00E9cution<br><b>tChronometerStart_1</b>";
		

 



/**
 * [tChronometerStart_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStart_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";
	
	
			cLabel="     D\u00E9but d'ex\u00E9cution<br><b>tChronometerStart_1</b>";
		

 
                if(log.isDebugEnabled())
            log.debug("tChronometerStart_1 - "  + ("Done.") );

ok_Hash.put("tChronometerStart_1", true);
end_Hash.put("tChronometerStart_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tChronometerStart_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStart_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";
	
	
			cLabel="     D\u00E9but d'ex\u00E9cution<br><b>tChronometerStart_1</b>";
		

 



/**
 * [tChronometerStart_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tDBConnection_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="     Connexion ODS<br><b>tDBConnection_1</b>";
		
		int tos_count_tDBConnection_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBConnection_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBConnection_1 = new StringBuilder();
                    log4jParamters_tDBConnection_1.append("Parameters:");
                            log4jParamters_tDBConnection_1.append("DB_VERSION" + " = " + "V9_X");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("HOST" + " = " + "context.serverName");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("PORT" + " = " + "context.port");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("DBNAME" + " = " + "context.database");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("SCHEMA_DB" + " = " + "context.schema_ods");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("USER" + " = " + "context.utilisateur");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.password)).substring(0, 4) + "...");     
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("USE_SHARED_CONNECTION" + " = " + "true");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("SHARED_CONNECTION_NAME" + " = " + "\"VENTE_ODS\"");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("PROPERTIES" + " = " + "context.additionalParam");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("AUTO_COMMIT" + " = " + "false");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("UNIFIED_COMPONENTS" + " = " + "tPostgresqlConnection");
                        log4jParamters_tDBConnection_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + (log4jParamters_tDBConnection_1) );
                    } 
                } 
            new BytesLimit65535_tDBConnection_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_1", "     Connexion ODS<br><b>tDBConnection_1</b>", "tPostgresqlConnection");
				talendJobLogProcess(globalMap);
			}
			


	
            String dbProperties_tDBConnection_1 = context.additionalParam;
            String url_tDBConnection_1 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database;
            
            if(dbProperties_tDBConnection_1 != null && !"".equals(dbProperties_tDBConnection_1.trim())) {
                url_tDBConnection_1 = url_tDBConnection_1 + "?" + dbProperties_tDBConnection_1;
            }
	String dbUser_tDBConnection_1 = context.utilisateur;
	
	
		
	final String decryptedPassword_tDBConnection_1 = context.password; 
		String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;
	
	
	java.sql.Connection conn_tDBConnection_1 = null;
	
        java.util.Enumeration<java.sql.Driver> drivers_tDBConnection_1 =  java.sql.DriverManager.getDrivers();
        java.util.Set<String> redShiftDriverNames_tDBConnection_1 = new java.util.HashSet<String>(java.util.Arrays
                .asList("com.amazon.redshift.jdbc.Driver","com.amazon.redshift.jdbc41.Driver","com.amazon.redshift.jdbc42.Driver"));
    while (drivers_tDBConnection_1.hasMoreElements()) {
        java.sql.Driver d_tDBConnection_1 = drivers_tDBConnection_1.nextElement();
        if (redShiftDriverNames_tDBConnection_1.contains(d_tDBConnection_1.getClass().getName())) {
            try {
                java.sql.DriverManager.deregisterDriver(d_tDBConnection_1);
                java.sql.DriverManager.registerDriver(d_tDBConnection_1);
            } catch (java.lang.Exception e_tDBConnection_1) {
globalMap.put("tDBConnection_1_ERROR_MESSAGE",e_tDBConnection_1.getMessage());
                    //do nothing
            }
        }
    }
	
			SharedDBConnectionLog4j.initLogger(log.getName(),"tDBConnection_1");
			String sharedConnectionName_tDBConnection_1 = "VENTE_ODS";
			conn_tDBConnection_1 = SharedDBConnectionLog4j.getDBConnection("org.postgresql.Driver",url_tDBConnection_1,dbUser_tDBConnection_1 , dbPwd_tDBConnection_1 , sharedConnectionName_tDBConnection_1);
			globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
	if (null != conn_tDBConnection_1) {
		
			log.debug("tDBConnection_1 - Connection is set auto commit to 'false'.");
			conn_tDBConnection_1.setAutoCommit(false);
	}

	globalMap.put("schema_" + "tDBConnection_1",context.schema_ods);

 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="     Connexion ODS<br><b>tDBConnection_1</b>";
		

 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="     Connexion ODS<br><b>tDBConnection_1</b>";
		

 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="     Connexion ODS<br><b>tDBConnection_1</b>";
		

 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="     Connexion ODS<br><b>tDBConnection_1</b>";
		

 
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + ("Done.") );

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tSetGlobalVar_1Process(globalMap);



/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="     Connexion ODS<br><b>tDBConnection_1</b>";
		

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tSetGlobalVar_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tSetGlobalVar_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tSetGlobalVar_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSetGlobalVar_1", false);
		start_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());
		
	
	currentComponent="tSetGlobalVar_1";
	
	
			cLabel=" Initialiser variables<br><b>tSetGlobalVar_1</b>";
		
		int tos_count_tSetGlobalVar_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tSetGlobalVar_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tSetGlobalVar_1 = new StringBuilder();
                    log4jParamters_tSetGlobalVar_1.append("Parameters:");
                            log4jParamters_tSetGlobalVar_1.append("VARIABLES" + " = " + "[{VALUE="+("\"ICOM_*_CATEGORY.csv\"")+", KEY="+("\"masque_fichier\"")+"}, {VALUE="+("\"CATEGORIE\"")+", KEY="+("\"nom_flux\"")+"}]");
                        log4jParamters_tSetGlobalVar_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_1 - "  + (log4jParamters_tSetGlobalVar_1) );
                    } 
                } 
            new BytesLimit65535_tSetGlobalVar_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tSetGlobalVar_1", " Initialiser variables<br><b>tSetGlobalVar_1</b>", "tSetGlobalVar");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tSetGlobalVar_1 begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";
	
	
			cLabel=" Initialiser variables<br><b>tSetGlobalVar_1</b>";
		

globalMap.put("masque_fichier", "ICOM_*_CATEGORY.csv");
globalMap.put("nom_flux", "CATEGORIE");

 


	tos_count_tSetGlobalVar_1++;

/**
 * [tSetGlobalVar_1 main ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";
	
	
			cLabel=" Initialiser variables<br><b>tSetGlobalVar_1</b>";
		

 



/**
 * [tSetGlobalVar_1 process_data_begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";
	
	
			cLabel=" Initialiser variables<br><b>tSetGlobalVar_1</b>";
		

 



/**
 * [tSetGlobalVar_1 process_data_end ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";
	
	
			cLabel=" Initialiser variables<br><b>tSetGlobalVar_1</b>";
		

 
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_1 - "  + ("Done.") );

ok_Hash.put("tSetGlobalVar_1", true);
end_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tJava_1Process(globalMap);



/**
 * [tSetGlobalVar_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tSetGlobalVar_1 finally ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";
	
	
			cLabel=" Initialiser variables<br><b>tSetGlobalVar_1</b>";
		

 



/**
 * [tSetGlobalVar_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tJava_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";
	
	
			cLabel="Logs D\u00E9but<br>  <b>tJava_1</b>";
		
		int tos_count_tJava_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJava_1", "Logs D\u00E9but<br>  <b>tJava_1</b>", "tJava");
				talendJobLogProcess(globalMap);
			}
			


System.out.println("-----------------------------------------------------------------------------");
System.out.println("Début d'exécution du job "+jobName+ "        : " + 
TalendDate.formatDate("yyyy-MM-dd HH:mm:ss",new java.util.Date(((Long)globalMap.get("tChronometerStart_1_STARTTIME"))))
);
System.out.println("-----------------------------------------------------------------------------");
 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	
			cLabel="Logs D\u00E9but<br>  <b>tJava_1</b>";
		

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	
			cLabel="Logs D\u00E9but<br>  <b>tJava_1</b>";
		

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	
			cLabel="Logs D\u00E9but<br>  <b>tJava_1</b>";
		

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	
			cLabel="Logs D\u00E9but<br>  <b>tJava_1</b>";
		

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	
			cLabel="Logs D\u00E9but<br>  <b>tJava_1</b>";
		

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	

public void tFileList_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileList_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tFileList_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tFileList_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileList_1", false);
		start_Hash.put("tFileList_1", System.currentTimeMillis());
		
	
	currentComponent="tFileList_1";
	
	
			cLabel="R\u00E9pertoire de donn\u00E9es<br>            <b>tFileList_1</b>";
		
		int tos_count_tFileList_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileList_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileList_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileList_1 = new StringBuilder();
                    log4jParamters_tFileList_1.append("Parameters:");
                            log4jParamters_tFileList_1.append("DIRECTORY" + " = " + "context.projectFolder+TalendDate.getDate(\"YYYYMMDD\")");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("LIST_MODE" + " = " + "FILES");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("INCLUDSUBDIR" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("CASE_SENSITIVE" + " = " + "YES");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ERROR" + " = " + "true");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("GLOBEXPRESSIONS" + " = " + "true");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("FILES" + " = " + "[{FILEMASK="+("((String)globalMap.get(\"masque_fichier\"))")+"}]");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_NOTHING" + " = " + "true");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_FILENAME" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_FILESIZE" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_MODIFIEDDATE" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_ACTION_ASC" + " = " + "true");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_ACTION_DESC" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("IFEXCLUDE" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("FORMAT_FILEPATH_TO_SLASH" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileList_1 - "  + (log4jParamters_tFileList_1) );
                    } 
                } 
            new BytesLimit65535_tFileList_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileList_1", "R\u00E9pertoire de donn\u00E9es<br>            <b>tFileList_1</b>", "tFileList");
				talendJobLogProcess(globalMap);
			}
			
	
 
  
				final StringBuffer log4jSb_tFileList_1 = new StringBuffer();
			   
    
  String directory_tFileList_1 = context.projectFolder+TalendDate.getDate("YYYYMMDD");
  final java.util.List<String> maskList_tFileList_1 = new java.util.ArrayList<String>();
  final java.util.List<java.util.regex.Pattern> patternList_tFileList_1 = new java.util.ArrayList<java.util.regex.Pattern>(); 
    maskList_tFileList_1.add(((String)globalMap.get("masque_fichier")));  
  for (final String filemask_tFileList_1 : maskList_tFileList_1) {
	String filemask_compile_tFileList_1 = filemask_tFileList_1;
	
		filemask_compile_tFileList_1 = org.apache.oro.text.GlobCompiler.globToPerl5(filemask_tFileList_1.toCharArray(), org.apache.oro.text.GlobCompiler.DEFAULT_MASK);
	
		java.util.regex.Pattern fileNamePattern_tFileList_1 = java.util.regex.Pattern.compile(filemask_compile_tFileList_1);
	patternList_tFileList_1.add(fileNamePattern_tFileList_1);
  }
  int NB_FILEtFileList_1 = 0;

  final boolean case_sensitive_tFileList_1 = true;
	
	
		log.info("tFileList_1 - Starting to search for matching entries.");
	
	
    final java.util.List<java.io.File> list_tFileList_1 = new java.util.ArrayList<java.io.File>();
    final java.util.Set<String> filePath_tFileList_1 = new java.util.HashSet<String>();
	java.io.File file_tFileList_1 = new java.io.File(directory_tFileList_1);
     
		file_tFileList_1.listFiles(new java.io.FilenameFilter() {
			public boolean accept(java.io.File dir, String name) {
				java.io.File file = new java.io.File(dir, name);
                if (!file.isDirectory()) {
                	
    	String fileName_tFileList_1 = file.getName();
		for (final java.util.regex.Pattern fileNamePattern_tFileList_1 : patternList_tFileList_1) {
          	if (fileNamePattern_tFileList_1.matcher(fileName_tFileList_1).matches()){
					if(!filePath_tFileList_1.contains(file.getAbsolutePath())) {
			          list_tFileList_1.add(file);
			          filePath_tFileList_1.add(file.getAbsolutePath());
			        }
			}
		}
                }
              return true;
            }
          }
      ); 
      java.util.Collections.sort(list_tFileList_1);
    
		log.info("tFileList_1 - Start to list files.");
	
    for (int i_tFileList_1 = 0; i_tFileList_1 < list_tFileList_1.size(); i_tFileList_1++){
      java.io.File files_tFileList_1 = list_tFileList_1.get(i_tFileList_1);
      String fileName_tFileList_1 = files_tFileList_1.getName();
      
      String currentFileName_tFileList_1 = files_tFileList_1.getName(); 
      String currentFilePath_tFileList_1 = files_tFileList_1.getAbsolutePath();
      String currentFileDirectory_tFileList_1 = files_tFileList_1.getParent();
      String currentFileExtension_tFileList_1 = null;
      
      if (files_tFileList_1.getName().contains(".") && files_tFileList_1.isFile()){
        currentFileExtension_tFileList_1 = files_tFileList_1.getName().substring(files_tFileList_1.getName().lastIndexOf(".") + 1);
      } else{
        currentFileExtension_tFileList_1 = "";
      }
      
      NB_FILEtFileList_1 ++;
      globalMap.put("tFileList_1_CURRENT_FILE", currentFileName_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEPATH", currentFilePath_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEDIRECTORY", currentFileDirectory_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEEXTENSION", currentFileExtension_tFileList_1);
      globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
      
		log.info("tFileList_1 - Current file or directory path : " + currentFilePath_tFileList_1);
	  
 



/**
 * [tFileList_1 begin ] stop
 */
	
	/**
	 * [tFileList_1 main ] start
	 */

	

	
	
	currentComponent="tFileList_1";
	
	
			cLabel="R\u00E9pertoire de donn\u00E9es<br>            <b>tFileList_1</b>";
		

 


	tos_count_tFileList_1++;

/**
 * [tFileList_1 main ] stop
 */
	
	/**
	 * [tFileList_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileList_1";
	
	
			cLabel="R\u00E9pertoire de donn\u00E9es<br>            <b>tFileList_1</b>";
		

 



/**
 * [tFileList_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileList_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileList_1";
	
	
			cLabel="R\u00E9pertoire de donn\u00E9es<br>            <b>tFileList_1</b>";
		

 



/**
 * [tFileList_1 process_data_end ] stop
 */
	
	/**
	 * [tFileList_1 end ] start
	 */

	

	
	
	currentComponent="tFileList_1";
	
	
			cLabel="R\u00E9pertoire de donn\u00E9es<br>            <b>tFileList_1</b>";
		

  
    }
  globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
  
    log.info("tFileList_1 - File or directory count : " + NB_FILEtFileList_1);

    if (NB_FILEtFileList_1 == 0) throw new RuntimeException("No file found in directory " + directory_tFileList_1);
  
 

 
                if(log.isDebugEnabled())
            log.debug("tFileList_1 - "  + ("Done.") );

ok_Hash.put("tFileList_1", true);
end_Hash.put("tFileList_1", System.currentTimeMillis());

   			if (((Integer)globalMap.get("tFileList_1_NB_FILE"))==1) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If1", 0, "true");
					}
				tFileInputDelimited_1Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If1", 0, "false");
					}   	 
   				}



/**
 * [tFileList_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileList_1 finally ] start
	 */

	

	
	
	currentComponent="tFileList_1";
	
	
			cLabel="R\u00E9pertoire de donn\u00E9es<br>            <b>tFileList_1</b>";
		

 



/**
 * [tFileList_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileList_1_SUBPROCESS_STATE", 1);
	}
	


public static class insertRejectStruct implements routines.system.IPersistableRow<insertRejectStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}

				public Boolean LB_CHEMIN_FICHIERIsNullable(){
				    return false;
				}
				public Boolean LB_CHEMIN_FICHIERIsKey(){
				    return true;
				}
				public Integer LB_CHEMIN_FICHIERLength(){
				    return 255;
				}
				public Integer LB_CHEMIN_FICHIERPrecision(){
				    return 0;
				}
				public String LB_CHEMIN_FICHIERDefault(){
				
					return null;
				
				}
				public String LB_CHEMIN_FICHIERComment(){
				
				    return "";
				
				}
				public String LB_CHEMIN_FICHIERPattern(){
				
					return "";
				
				}
				public String LB_CHEMIN_FICHIEROriginalDbColumnName(){
				
					return "LB_CHEMIN_FICHIER";
				
				}

				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}

				public Boolean LB_NOM_FICHIERIsNullable(){
				    return false;
				}
				public Boolean LB_NOM_FICHIERIsKey(){
				    return true;
				}
				public Integer LB_NOM_FICHIERLength(){
				    return 100;
				}
				public Integer LB_NOM_FICHIERPrecision(){
				    return 0;
				}
				public String LB_NOM_FICHIERDefault(){
				
					return null;
				
				}
				public String LB_NOM_FICHIERComment(){
				
				    return "";
				
				}
				public String LB_NOM_FICHIERPattern(){
				
					return "";
				
				}
				public String LB_NOM_FICHIEROriginalDbColumnName(){
				
					return "LB_NOM_FICHIER";
				
				}

				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}

				public Boolean NUM_LIGNE_REJETIsNullable(){
				    return false;
				}
				public Boolean NUM_LIGNE_REJETIsKey(){
				    return true;
				}
				public Integer NUM_LIGNE_REJETLength(){
				    return 10;
				}
				public Integer NUM_LIGNE_REJETPrecision(){
				    return 0;
				}
				public String NUM_LIGNE_REJETDefault(){
				
					return null;
				
				}
				public String NUM_LIGNE_REJETComment(){
				
				    return "";
				
				}
				public String NUM_LIGNE_REJETPattern(){
				
					return "";
				
				}
				public String NUM_LIGNE_REJETOriginalDbColumnName(){
				
					return "NUM_LIGNE_REJET";
				
				}

				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}

				public Boolean LB_LIGNE_REJETIsNullable(){
				    return false;
				}
				public Boolean LB_LIGNE_REJETIsKey(){
				    return true;
				}
				public Integer LB_LIGNE_REJETLength(){
				    return 500;
				}
				public Integer LB_LIGNE_REJETPrecision(){
				    return 0;
				}
				public String LB_LIGNE_REJETDefault(){
				
					return null;
				
				}
				public String LB_LIGNE_REJETComment(){
				
				    return "";
				
				}
				public String LB_LIGNE_REJETPattern(){
				
					return "";
				
				}
				public String LB_LIGNE_REJETOriginalDbColumnName(){
				
					return "LB_LIGNE_REJET";
				
				}

				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}

				public Boolean LB_MESSAGE_REJETIsNullable(){
				    return false;
				}
				public Boolean LB_MESSAGE_REJETIsKey(){
				    return false;
				}
				public Integer LB_MESSAGE_REJETLength(){
				    return 100;
				}
				public Integer LB_MESSAGE_REJETPrecision(){
				    return 0;
				}
				public String LB_MESSAGE_REJETDefault(){
				
					return null;
				
				}
				public String LB_MESSAGE_REJETComment(){
				
				    return "";
				
				}
				public String LB_MESSAGE_REJETPattern(){
				
					return "";
				
				}
				public String LB_MESSAGE_REJETOriginalDbColumnName(){
				
					return "LB_MESSAGE_REJET";
				
				}

				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}

				public Boolean LB_NOM_FLUXIsNullable(){
				    return false;
				}
				public Boolean LB_NOM_FLUXIsKey(){
				    return false;
				}
				public Integer LB_NOM_FLUXLength(){
				    return 100;
				}
				public Integer LB_NOM_FLUXPrecision(){
				    return 0;
				}
				public String LB_NOM_FLUXDefault(){
				
					return null;
				
				}
				public String LB_NOM_FLUXComment(){
				
				    return "";
				
				}
				public String LB_NOM_FLUXPattern(){
				
					return "";
				
				}
				public String LB_NOM_FLUXOriginalDbColumnName(){
				
					return "LB_NOM_FLUX";
				
				}

				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}

				public Boolean DT_REJETIsNullable(){
				    return false;
				}
				public Boolean DT_REJETIsKey(){
				    return false;
				}
				public Integer DT_REJETLength(){
				    return 29;
				}
				public Integer DT_REJETPrecision(){
				    return 6;
				}
				public String DT_REJETDefault(){
				
					return null;
				
				}
				public String DT_REJETComment(){
				
				    return "";
				
				}
				public String DT_REJETPattern(){
				
					return "dd-MM-yyyy HH:mm:ss";
				
				}
				public String DT_REJETOriginalDbColumnName(){
				
					return "DT_REJET";
				
				}

				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}

				public Boolean LB_JOB_NAMEIsNullable(){
				    return false;
				}
				public Boolean LB_JOB_NAMEIsKey(){
				    return false;
				}
				public Integer LB_JOB_NAMELength(){
				    return 100;
				}
				public Integer LB_JOB_NAMEPrecision(){
				    return 0;
				}
				public String LB_JOB_NAMEDefault(){
				
					return null;
				
				}
				public String LB_JOB_NAMEComment(){
				
				    return "";
				
				}
				public String LB_JOB_NAMEPattern(){
				
					return "";
				
				}
				public String LB_JOB_NAMEOriginalDbColumnName(){
				
					return "LB_JOB_NAME";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.LB_CHEMIN_FICHIER == null) ? 0 : this.LB_CHEMIN_FICHIER.hashCode());
					
						result = prime * result + ((this.LB_NOM_FICHIER == null) ? 0 : this.LB_NOM_FICHIER.hashCode());
					
							result = prime * result + (int) this.NUM_LIGNE_REJET;
						
						result = prime * result + ((this.LB_LIGNE_REJET == null) ? 0 : this.LB_LIGNE_REJET.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final insertRejectStruct other = (insertRejectStruct) obj;
		
						if (this.LB_CHEMIN_FICHIER == null) {
							if (other.LB_CHEMIN_FICHIER != null)
								return false;
						
						} else if (!this.LB_CHEMIN_FICHIER.equals(other.LB_CHEMIN_FICHIER))
						
							return false;
					
						if (this.LB_NOM_FICHIER == null) {
							if (other.LB_NOM_FICHIER != null)
								return false;
						
						} else if (!this.LB_NOM_FICHIER.equals(other.LB_NOM_FICHIER))
						
							return false;
					
						if (this.NUM_LIGNE_REJET != other.NUM_LIGNE_REJET)
							return false;
					
						if (this.LB_LIGNE_REJET == null) {
							if (other.LB_LIGNE_REJET != null)
								return false;
						
						} else if (!this.LB_LIGNE_REJET.equals(other.LB_LIGNE_REJET))
						
							return false;
					

		return true;
    }

	public void copyDataTo(insertRejectStruct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            other.LB_MESSAGE_REJET = this.LB_MESSAGE_REJET;
	            other.LB_NOM_FLUX = this.LB_NOM_FLUX;
	            other.DT_REJET = this.DT_REJET;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(insertRejectStruct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            	other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            	other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            	other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(LB_CHEMIN_FICHIER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CHEMIN_FICHIER);
            			}
            		
        			sb.append("|");
        		
        				if(LB_NOM_FICHIER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_NOM_FICHIER);
            			}
            		
        			sb.append("|");
        		
        				sb.append(NUM_LIGNE_REJET);
        			
        			sb.append("|");
        		
        				if(LB_LIGNE_REJET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_LIGNE_REJET);
            			}
            		
        			sb.append("|");
        		
        				if(LB_MESSAGE_REJET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_MESSAGE_REJET);
            			}
            		
        			sb.append("|");
        		
        				if(LB_NOM_FLUX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_NOM_FLUX);
            			}
            		
        			sb.append("|");
        		
        				if(DT_REJET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_REJET);
            			}
            		
        			sb.append("|");
        		
        				if(LB_JOB_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_JOB_NAME);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(insertRejectStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.LB_CHEMIN_FICHIER, other.LB_CHEMIN_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_NOM_FICHIER, other.LB_NOM_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.NUM_LIGNE_REJET, other.NUM_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_LIGNE_REJET, other.LB_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class insertDuplicateStruct implements routines.system.IPersistableRow<insertDuplicateStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}

				public Boolean LB_CHEMIN_FICHIERIsNullable(){
				    return false;
				}
				public Boolean LB_CHEMIN_FICHIERIsKey(){
				    return true;
				}
				public Integer LB_CHEMIN_FICHIERLength(){
				    return 255;
				}
				public Integer LB_CHEMIN_FICHIERPrecision(){
				    return 0;
				}
				public String LB_CHEMIN_FICHIERDefault(){
				
					return null;
				
				}
				public String LB_CHEMIN_FICHIERComment(){
				
				    return "";
				
				}
				public String LB_CHEMIN_FICHIERPattern(){
				
					return "";
				
				}
				public String LB_CHEMIN_FICHIEROriginalDbColumnName(){
				
					return "LB_CHEMIN_FICHIER";
				
				}

				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}

				public Boolean LB_NOM_FICHIERIsNullable(){
				    return false;
				}
				public Boolean LB_NOM_FICHIERIsKey(){
				    return true;
				}
				public Integer LB_NOM_FICHIERLength(){
				    return 100;
				}
				public Integer LB_NOM_FICHIERPrecision(){
				    return 0;
				}
				public String LB_NOM_FICHIERDefault(){
				
					return null;
				
				}
				public String LB_NOM_FICHIERComment(){
				
				    return "";
				
				}
				public String LB_NOM_FICHIERPattern(){
				
					return "";
				
				}
				public String LB_NOM_FICHIEROriginalDbColumnName(){
				
					return "LB_NOM_FICHIER";
				
				}

				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}

				public Boolean NUM_LIGNE_REJETIsNullable(){
				    return false;
				}
				public Boolean NUM_LIGNE_REJETIsKey(){
				    return true;
				}
				public Integer NUM_LIGNE_REJETLength(){
				    return 10;
				}
				public Integer NUM_LIGNE_REJETPrecision(){
				    return 0;
				}
				public String NUM_LIGNE_REJETDefault(){
				
					return null;
				
				}
				public String NUM_LIGNE_REJETComment(){
				
				    return "";
				
				}
				public String NUM_LIGNE_REJETPattern(){
				
					return "";
				
				}
				public String NUM_LIGNE_REJETOriginalDbColumnName(){
				
					return "NUM_LIGNE_REJET";
				
				}

				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}

				public Boolean LB_LIGNE_REJETIsNullable(){
				    return false;
				}
				public Boolean LB_LIGNE_REJETIsKey(){
				    return true;
				}
				public Integer LB_LIGNE_REJETLength(){
				    return 500;
				}
				public Integer LB_LIGNE_REJETPrecision(){
				    return 0;
				}
				public String LB_LIGNE_REJETDefault(){
				
					return null;
				
				}
				public String LB_LIGNE_REJETComment(){
				
				    return "";
				
				}
				public String LB_LIGNE_REJETPattern(){
				
					return "";
				
				}
				public String LB_LIGNE_REJETOriginalDbColumnName(){
				
					return "LB_LIGNE_REJET";
				
				}

				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}

				public Boolean LB_MESSAGE_REJETIsNullable(){
				    return false;
				}
				public Boolean LB_MESSAGE_REJETIsKey(){
				    return false;
				}
				public Integer LB_MESSAGE_REJETLength(){
				    return 100;
				}
				public Integer LB_MESSAGE_REJETPrecision(){
				    return 0;
				}
				public String LB_MESSAGE_REJETDefault(){
				
					return null;
				
				}
				public String LB_MESSAGE_REJETComment(){
				
				    return "";
				
				}
				public String LB_MESSAGE_REJETPattern(){
				
					return "";
				
				}
				public String LB_MESSAGE_REJETOriginalDbColumnName(){
				
					return "LB_MESSAGE_REJET";
				
				}

				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}

				public Boolean LB_NOM_FLUXIsNullable(){
				    return false;
				}
				public Boolean LB_NOM_FLUXIsKey(){
				    return false;
				}
				public Integer LB_NOM_FLUXLength(){
				    return 100;
				}
				public Integer LB_NOM_FLUXPrecision(){
				    return 0;
				}
				public String LB_NOM_FLUXDefault(){
				
					return null;
				
				}
				public String LB_NOM_FLUXComment(){
				
				    return "";
				
				}
				public String LB_NOM_FLUXPattern(){
				
					return "";
				
				}
				public String LB_NOM_FLUXOriginalDbColumnName(){
				
					return "LB_NOM_FLUX";
				
				}

				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}

				public Boolean DT_REJETIsNullable(){
				    return false;
				}
				public Boolean DT_REJETIsKey(){
				    return false;
				}
				public Integer DT_REJETLength(){
				    return 29;
				}
				public Integer DT_REJETPrecision(){
				    return 6;
				}
				public String DT_REJETDefault(){
				
					return null;
				
				}
				public String DT_REJETComment(){
				
				    return "";
				
				}
				public String DT_REJETPattern(){
				
					return "dd-MM-yyyy HH:mm:ss";
				
				}
				public String DT_REJETOriginalDbColumnName(){
				
					return "DT_REJET";
				
				}

				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}

				public Boolean LB_JOB_NAMEIsNullable(){
				    return false;
				}
				public Boolean LB_JOB_NAMEIsKey(){
				    return false;
				}
				public Integer LB_JOB_NAMELength(){
				    return 100;
				}
				public Integer LB_JOB_NAMEPrecision(){
				    return 0;
				}
				public String LB_JOB_NAMEDefault(){
				
					return null;
				
				}
				public String LB_JOB_NAMEComment(){
				
				    return "";
				
				}
				public String LB_JOB_NAMEPattern(){
				
					return "";
				
				}
				public String LB_JOB_NAMEOriginalDbColumnName(){
				
					return "LB_JOB_NAME";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.LB_CHEMIN_FICHIER == null) ? 0 : this.LB_CHEMIN_FICHIER.hashCode());
					
						result = prime * result + ((this.LB_NOM_FICHIER == null) ? 0 : this.LB_NOM_FICHIER.hashCode());
					
							result = prime * result + (int) this.NUM_LIGNE_REJET;
						
						result = prime * result + ((this.LB_LIGNE_REJET == null) ? 0 : this.LB_LIGNE_REJET.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final insertDuplicateStruct other = (insertDuplicateStruct) obj;
		
						if (this.LB_CHEMIN_FICHIER == null) {
							if (other.LB_CHEMIN_FICHIER != null)
								return false;
						
						} else if (!this.LB_CHEMIN_FICHIER.equals(other.LB_CHEMIN_FICHIER))
						
							return false;
					
						if (this.LB_NOM_FICHIER == null) {
							if (other.LB_NOM_FICHIER != null)
								return false;
						
						} else if (!this.LB_NOM_FICHIER.equals(other.LB_NOM_FICHIER))
						
							return false;
					
						if (this.NUM_LIGNE_REJET != other.NUM_LIGNE_REJET)
							return false;
					
						if (this.LB_LIGNE_REJET == null) {
							if (other.LB_LIGNE_REJET != null)
								return false;
						
						} else if (!this.LB_LIGNE_REJET.equals(other.LB_LIGNE_REJET))
						
							return false;
					

		return true;
    }

	public void copyDataTo(insertDuplicateStruct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            other.LB_MESSAGE_REJET = this.LB_MESSAGE_REJET;
	            other.LB_NOM_FLUX = this.LB_NOM_FLUX;
	            other.DT_REJET = this.DT_REJET;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(insertDuplicateStruct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            	other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            	other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            	other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(LB_CHEMIN_FICHIER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CHEMIN_FICHIER);
            			}
            		
        			sb.append("|");
        		
        				if(LB_NOM_FICHIER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_NOM_FICHIER);
            			}
            		
        			sb.append("|");
        		
        				sb.append(NUM_LIGNE_REJET);
        			
        			sb.append("|");
        		
        				if(LB_LIGNE_REJET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_LIGNE_REJET);
            			}
            		
        			sb.append("|");
        		
        				if(LB_MESSAGE_REJET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_MESSAGE_REJET);
            			}
            		
        			sb.append("|");
        		
        				if(LB_NOM_FLUX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_NOM_FLUX);
            			}
            		
        			sb.append("|");
        		
        				if(DT_REJET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_REJET);
            			}
            		
        			sb.append("|");
        		
        				if(LB_JOB_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_JOB_NAME);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(insertDuplicateStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.LB_CHEMIN_FICHIER, other.LB_CHEMIN_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_NOM_FICHIER, other.LB_NOM_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.NUM_LIGNE_REJET, other.NUM_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_LIGNE_REJET, other.LB_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class insertCategorieStruct implements routines.system.IPersistableRow<insertCategorieStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}

				public Boolean CD_CATEGORIEIsNullable(){
				    return false;
				}
				public Boolean CD_CATEGORIEIsKey(){
				    return true;
				}
				public Integer CD_CATEGORIELength(){
				    return 50;
				}
				public Integer CD_CATEGORIEPrecision(){
				    return 0;
				}
				public String CD_CATEGORIEDefault(){
				
					return null;
				
				}
				public String CD_CATEGORIEComment(){
				
				    return "";
				
				}
				public String CD_CATEGORIEPattern(){
				
					return "";
				
				}
				public String CD_CATEGORIEOriginalDbColumnName(){
				
					return "CD_CATEGORIE";
				
				}

				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}

				public Boolean LB_CATEGORIEIsNullable(){
				    return false;
				}
				public Boolean LB_CATEGORIEIsKey(){
				    return false;
				}
				public Integer LB_CATEGORIELength(){
				    return 100;
				}
				public Integer LB_CATEGORIEPrecision(){
				    return 0;
				}
				public String LB_CATEGORIEDefault(){
				
					return null;
				
				}
				public String LB_CATEGORIEComment(){
				
				    return "";
				
				}
				public String LB_CATEGORIEPattern(){
				
					return "";
				
				}
				public String LB_CATEGORIEOriginalDbColumnName(){
				
					return "LB_CATEGORIE";
				
				}

				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}

				public Boolean LB_NOM_FICHIERIsNullable(){
				    return false;
				}
				public Boolean LB_NOM_FICHIERIsKey(){
				    return false;
				}
				public Integer LB_NOM_FICHIERLength(){
				    return 100;
				}
				public Integer LB_NOM_FICHIERPrecision(){
				    return 0;
				}
				public String LB_NOM_FICHIERDefault(){
				
					return null;
				
				}
				public String LB_NOM_FICHIERComment(){
				
				    return "";
				
				}
				public String LB_NOM_FICHIERPattern(){
				
					return "";
				
				}
				public String LB_NOM_FICHIEROriginalDbColumnName(){
				
					return "LB_NOM_FICHIER";
				
				}

				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}

				public Boolean DT_INSERTIONIsNullable(){
				    return false;
				}
				public Boolean DT_INSERTIONIsKey(){
				    return false;
				}
				public Integer DT_INSERTIONLength(){
				    return 29;
				}
				public Integer DT_INSERTIONPrecision(){
				    return 6;
				}
				public String DT_INSERTIONDefault(){
				
					return null;
				
				}
				public String DT_INSERTIONComment(){
				
				    return "";
				
				}
				public String DT_INSERTIONPattern(){
				
					return "dd-MM-yyyy HH:mm:ss";
				
				}
				public String DT_INSERTIONOriginalDbColumnName(){
				
					return "DT_INSERTION";
				
				}

				
			    public int BL_LIGNE_ACTIVE;

				public int getBL_LIGNE_ACTIVE () {
					return this.BL_LIGNE_ACTIVE;
				}

				public Boolean BL_LIGNE_ACTIVEIsNullable(){
				    return false;
				}
				public Boolean BL_LIGNE_ACTIVEIsKey(){
				    return false;
				}
				public Integer BL_LIGNE_ACTIVELength(){
				    return 10;
				}
				public Integer BL_LIGNE_ACTIVEPrecision(){
				    return 0;
				}
				public String BL_LIGNE_ACTIVEDefault(){
				
					return null;
				
				}
				public String BL_LIGNE_ACTIVEComment(){
				
				    return "";
				
				}
				public String BL_LIGNE_ACTIVEPattern(){
				
					return "";
				
				}
				public String BL_LIGNE_ACTIVEOriginalDbColumnName(){
				
					return "BL_LIGNE_ACTIVE";
				
				}

				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}

				public Boolean LB_JOB_NAMEIsNullable(){
				    return false;
				}
				public Boolean LB_JOB_NAMEIsKey(){
				    return false;
				}
				public Integer LB_JOB_NAMELength(){
				    return 100;
				}
				public Integer LB_JOB_NAMEPrecision(){
				    return 0;
				}
				public String LB_JOB_NAMEDefault(){
				
					return null;
				
				}
				public String LB_JOB_NAMEComment(){
				
				    return "";
				
				}
				public String LB_JOB_NAMEPattern(){
				
					return "";
				
				}
				public String LB_JOB_NAMEOriginalDbColumnName(){
				
					return "LB_JOB_NAME";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CD_CATEGORIE == null) ? 0 : this.CD_CATEGORIE.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final insertCategorieStruct other = (insertCategorieStruct) obj;
		
						if (this.CD_CATEGORIE == null) {
							if (other.CD_CATEGORIE != null)
								return false;
						
						} else if (!this.CD_CATEGORIE.equals(other.CD_CATEGORIE))
						
							return false;
					

		return true;
    }

	public void copyDataTo(insertCategorieStruct other) {

		other.CD_CATEGORIE = this.CD_CATEGORIE;
	            other.LB_CATEGORIE = this.LB_CATEGORIE;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.BL_LIGNE_ACTIVE = this.BL_LIGNE_ACTIVE;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(insertCategorieStruct other) {

		other.CD_CATEGORIE = this.CD_CATEGORIE;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
			        this.BL_LIGNE_ACTIVE = dis.readInt();
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
			        this.BL_LIGNE_ACTIVE = dis.readInt();
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// int
				
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// int
				
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CD_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CD_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_NOM_FICHIER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_NOM_FICHIER);
            			}
            		
        			sb.append("|");
        		
        				if(DT_INSERTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_INSERTION);
            			}
            		
        			sb.append("|");
        		
        				sb.append(BL_LIGNE_ACTIVE);
        			
        			sb.append("|");
        		
        				if(LB_JOB_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_JOB_NAME);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(insertCategorieStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CD_CATEGORIE, other.CD_CATEGORIE);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class updateBlCurrentStruct implements routines.system.IPersistableRow<updateBlCurrentStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}

				public Boolean CD_CATEGORIEIsNullable(){
				    return false;
				}
				public Boolean CD_CATEGORIEIsKey(){
				    return true;
				}
				public Integer CD_CATEGORIELength(){
				    return 50;
				}
				public Integer CD_CATEGORIEPrecision(){
				    return 0;
				}
				public String CD_CATEGORIEDefault(){
				
					return null;
				
				}
				public String CD_CATEGORIEComment(){
				
				    return "";
				
				}
				public String CD_CATEGORIEPattern(){
				
					return "";
				
				}
				public String CD_CATEGORIEOriginalDbColumnName(){
				
					return "CD_CATEGORIE";
				
				}

				
			    public int BL_LIGNE_ACTIVE;

				public int getBL_LIGNE_ACTIVE () {
					return this.BL_LIGNE_ACTIVE;
				}

				public Boolean BL_LIGNE_ACTIVEIsNullable(){
				    return false;
				}
				public Boolean BL_LIGNE_ACTIVEIsKey(){
				    return false;
				}
				public Integer BL_LIGNE_ACTIVELength(){
				    return 10;
				}
				public Integer BL_LIGNE_ACTIVEPrecision(){
				    return 0;
				}
				public String BL_LIGNE_ACTIVEDefault(){
				
					return null;
				
				}
				public String BL_LIGNE_ACTIVEComment(){
				
				    return "";
				
				}
				public String BL_LIGNE_ACTIVEPattern(){
				
					return "";
				
				}
				public String BL_LIGNE_ACTIVEOriginalDbColumnName(){
				
					return "BL_LIGNE_ACTIVE";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CD_CATEGORIE == null) ? 0 : this.CD_CATEGORIE.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final updateBlCurrentStruct other = (updateBlCurrentStruct) obj;
		
						if (this.CD_CATEGORIE == null) {
							if (other.CD_CATEGORIE != null)
								return false;
						
						} else if (!this.CD_CATEGORIE.equals(other.CD_CATEGORIE))
						
							return false;
					

		return true;
    }

	public void copyDataTo(updateBlCurrentStruct other) {

		other.CD_CATEGORIE = this.CD_CATEGORIE;
	            other.BL_LIGNE_ACTIVE = this.BL_LIGNE_ACTIVE;
	            
	}

	public void copyKeysDataTo(updateBlCurrentStruct other) {

		other.CD_CATEGORIE = this.CD_CATEGORIE;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
			        this.BL_LIGNE_ACTIVE = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
			        this.BL_LIGNE_ACTIVE = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// int
				
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// int
				
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CD_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CD_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				sb.append(BL_LIGNE_ACTIVE);
        			
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(updateBlCurrentStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CD_CATEGORIE, other.CD_CATEGORIE);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class insertNewValueCategorieStruct implements routines.system.IPersistableRow<insertNewValueCategorieStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}

				public Boolean CD_CATEGORIEIsNullable(){
				    return false;
				}
				public Boolean CD_CATEGORIEIsKey(){
				    return true;
				}
				public Integer CD_CATEGORIELength(){
				    return 50;
				}
				public Integer CD_CATEGORIEPrecision(){
				    return 0;
				}
				public String CD_CATEGORIEDefault(){
				
					return null;
				
				}
				public String CD_CATEGORIEComment(){
				
				    return "";
				
				}
				public String CD_CATEGORIEPattern(){
				
					return "";
				
				}
				public String CD_CATEGORIEOriginalDbColumnName(){
				
					return "CD_CATEGORIE";
				
				}

				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}

				public Boolean LB_CATEGORIEIsNullable(){
				    return false;
				}
				public Boolean LB_CATEGORIEIsKey(){
				    return false;
				}
				public Integer LB_CATEGORIELength(){
				    return 100;
				}
				public Integer LB_CATEGORIEPrecision(){
				    return 0;
				}
				public String LB_CATEGORIEDefault(){
				
					return null;
				
				}
				public String LB_CATEGORIEComment(){
				
				    return "";
				
				}
				public String LB_CATEGORIEPattern(){
				
					return "";
				
				}
				public String LB_CATEGORIEOriginalDbColumnName(){
				
					return "LB_CATEGORIE";
				
				}

				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}

				public Boolean LB_NOM_FICHIERIsNullable(){
				    return false;
				}
				public Boolean LB_NOM_FICHIERIsKey(){
				    return false;
				}
				public Integer LB_NOM_FICHIERLength(){
				    return 100;
				}
				public Integer LB_NOM_FICHIERPrecision(){
				    return 0;
				}
				public String LB_NOM_FICHIERDefault(){
				
					return null;
				
				}
				public String LB_NOM_FICHIERComment(){
				
				    return "";
				
				}
				public String LB_NOM_FICHIERPattern(){
				
					return "";
				
				}
				public String LB_NOM_FICHIEROriginalDbColumnName(){
				
					return "LB_NOM_FICHIER";
				
				}

				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}

				public Boolean DT_INSERTIONIsNullable(){
				    return false;
				}
				public Boolean DT_INSERTIONIsKey(){
				    return false;
				}
				public Integer DT_INSERTIONLength(){
				    return 29;
				}
				public Integer DT_INSERTIONPrecision(){
				    return 6;
				}
				public String DT_INSERTIONDefault(){
				
					return null;
				
				}
				public String DT_INSERTIONComment(){
				
				    return "";
				
				}
				public String DT_INSERTIONPattern(){
				
					return "dd-MM-yyyy HH:mm:ss";
				
				}
				public String DT_INSERTIONOriginalDbColumnName(){
				
					return "DT_INSERTION";
				
				}

				
			    public int BL_LIGNE_ACTIVE;

				public int getBL_LIGNE_ACTIVE () {
					return this.BL_LIGNE_ACTIVE;
				}

				public Boolean BL_LIGNE_ACTIVEIsNullable(){
				    return false;
				}
				public Boolean BL_LIGNE_ACTIVEIsKey(){
				    return false;
				}
				public Integer BL_LIGNE_ACTIVELength(){
				    return 10;
				}
				public Integer BL_LIGNE_ACTIVEPrecision(){
				    return 0;
				}
				public String BL_LIGNE_ACTIVEDefault(){
				
					return null;
				
				}
				public String BL_LIGNE_ACTIVEComment(){
				
				    return "";
				
				}
				public String BL_LIGNE_ACTIVEPattern(){
				
					return "";
				
				}
				public String BL_LIGNE_ACTIVEOriginalDbColumnName(){
				
					return "BL_LIGNE_ACTIVE";
				
				}

				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}

				public Boolean LB_JOB_NAMEIsNullable(){
				    return false;
				}
				public Boolean LB_JOB_NAMEIsKey(){
				    return false;
				}
				public Integer LB_JOB_NAMELength(){
				    return 100;
				}
				public Integer LB_JOB_NAMEPrecision(){
				    return 0;
				}
				public String LB_JOB_NAMEDefault(){
				
					return null;
				
				}
				public String LB_JOB_NAMEComment(){
				
				    return "";
				
				}
				public String LB_JOB_NAMEPattern(){
				
					return "";
				
				}
				public String LB_JOB_NAMEOriginalDbColumnName(){
				
					return "LB_JOB_NAME";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CD_CATEGORIE == null) ? 0 : this.CD_CATEGORIE.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final insertNewValueCategorieStruct other = (insertNewValueCategorieStruct) obj;
		
						if (this.CD_CATEGORIE == null) {
							if (other.CD_CATEGORIE != null)
								return false;
						
						} else if (!this.CD_CATEGORIE.equals(other.CD_CATEGORIE))
						
							return false;
					

		return true;
    }

	public void copyDataTo(insertNewValueCategorieStruct other) {

		other.CD_CATEGORIE = this.CD_CATEGORIE;
	            other.LB_CATEGORIE = this.LB_CATEGORIE;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.BL_LIGNE_ACTIVE = this.BL_LIGNE_ACTIVE;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(insertNewValueCategorieStruct other) {

		other.CD_CATEGORIE = this.CD_CATEGORIE;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
			        this.BL_LIGNE_ACTIVE = dis.readInt();
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
			        this.BL_LIGNE_ACTIVE = dis.readInt();
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// int
				
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// int
				
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CD_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CD_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_NOM_FICHIER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_NOM_FICHIER);
            			}
            		
        			sb.append("|");
        		
        				if(DT_INSERTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_INSERTION);
            			}
            		
        			sb.append("|");
        		
        				sb.append(BL_LIGNE_ACTIVE);
        			
        			sb.append("|");
        		
        				if(LB_JOB_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_JOB_NAME);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(insertNewValueCategorieStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CD_CATEGORIE, other.CD_CATEGORIE);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];

	
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}

				public Boolean CD_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean CD_CATEGORIEIsKey(){
				    return false;
				}
				public Integer CD_CATEGORIELength(){
				    return 0;
				}
				public Integer CD_CATEGORIEPrecision(){
				    return 0;
				}
				public String CD_CATEGORIEDefault(){
				
					return null;
				
				}
				public String CD_CATEGORIEComment(){
				
				    return "";
				
				}
				public String CD_CATEGORIEPattern(){
				
					return "";
				
				}
				public String CD_CATEGORIEOriginalDbColumnName(){
				
					return "CD_CATEGORIE";
				
				}

				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}

				public Boolean LB_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean LB_CATEGORIEIsKey(){
				    return false;
				}
				public Integer LB_CATEGORIELength(){
				    return 0;
				}
				public Integer LB_CATEGORIEPrecision(){
				    return 0;
				}
				public String LB_CATEGORIEDefault(){
				
					return null;
				
				}
				public String LB_CATEGORIEComment(){
				
				    return "";
				
				}
				public String LB_CATEGORIEPattern(){
				
					return "";
				
				}
				public String LB_CATEGORIEOriginalDbColumnName(){
				
					return "LB_CATEGORIE";
				
				}

				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}

				public Boolean NUM_LIGNEIsNullable(){
				    return true;
				}
				public Boolean NUM_LIGNEIsKey(){
				    return false;
				}
				public Integer NUM_LIGNELength(){
				    return null;
				}
				public Integer NUM_LIGNEPrecision(){
				    return null;
				}
				public String NUM_LIGNEDefault(){
				
					return null;
				
				}
				public String NUM_LIGNEComment(){
				
				    return "";
				
				}
				public String NUM_LIGNEPattern(){
				
					return "";
				
				}
				public String NUM_LIGNEOriginalDbColumnName(){
				
					return "NUM_LIGNE";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CD_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CD_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_LIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_LIGNE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];

	
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}

				public Boolean CD_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean CD_CATEGORIEIsKey(){
				    return false;
				}
				public Integer CD_CATEGORIELength(){
				    return 0;
				}
				public Integer CD_CATEGORIEPrecision(){
				    return 0;
				}
				public String CD_CATEGORIEDefault(){
				
					return null;
				
				}
				public String CD_CATEGORIEComment(){
				
				    return "";
				
				}
				public String CD_CATEGORIEPattern(){
				
					return "";
				
				}
				public String CD_CATEGORIEOriginalDbColumnName(){
				
					return "CD_CATEGORIE";
				
				}

				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}

				public Boolean LB_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean LB_CATEGORIEIsKey(){
				    return false;
				}
				public Integer LB_CATEGORIELength(){
				    return 0;
				}
				public Integer LB_CATEGORIEPrecision(){
				    return 0;
				}
				public String LB_CATEGORIEDefault(){
				
					return null;
				
				}
				public String LB_CATEGORIEComment(){
				
				    return "";
				
				}
				public String LB_CATEGORIEPattern(){
				
					return "";
				
				}
				public String LB_CATEGORIEOriginalDbColumnName(){
				
					return "LB_CATEGORIE";
				
				}

				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}

				public Boolean NUM_LIGNEIsNullable(){
				    return true;
				}
				public Boolean NUM_LIGNEIsKey(){
				    return false;
				}
				public Integer NUM_LIGNELength(){
				    return null;
				}
				public Integer NUM_LIGNEPrecision(){
				    return null;
				}
				public String NUM_LIGNEDefault(){
				
					return null;
				
				}
				public String NUM_LIGNEComment(){
				
				    return "";
				
				}
				public String NUM_LIGNEPattern(){
				
					return "";
				
				}
				public String NUM_LIGNEOriginalDbColumnName(){
				
					return "NUM_LIGNE";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CD_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CD_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_LIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_LIGNE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];

	
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}

				public Boolean CD_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean CD_CATEGORIEIsKey(){
				    return false;
				}
				public Integer CD_CATEGORIELength(){
				    return 0;
				}
				public Integer CD_CATEGORIEPrecision(){
				    return 0;
				}
				public String CD_CATEGORIEDefault(){
				
					return null;
				
				}
				public String CD_CATEGORIEComment(){
				
				    return "";
				
				}
				public String CD_CATEGORIEPattern(){
				
					return "";
				
				}
				public String CD_CATEGORIEOriginalDbColumnName(){
				
					return "CD_CATEGORIE";
				
				}

				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}

				public Boolean LB_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean LB_CATEGORIEIsKey(){
				    return false;
				}
				public Integer LB_CATEGORIELength(){
				    return 0;
				}
				public Integer LB_CATEGORIEPrecision(){
				    return 0;
				}
				public String LB_CATEGORIEDefault(){
				
					return null;
				
				}
				public String LB_CATEGORIEComment(){
				
				    return "";
				
				}
				public String LB_CATEGORIEPattern(){
				
					return "";
				
				}
				public String LB_CATEGORIEOriginalDbColumnName(){
				
					return "LB_CATEGORIE";
				
				}

				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}

				public Boolean NUM_LIGNEIsNullable(){
				    return true;
				}
				public Boolean NUM_LIGNEIsKey(){
				    return false;
				}
				public Integer NUM_LIGNELength(){
				    return null;
				}
				public Integer NUM_LIGNEPrecision(){
				    return null;
				}
				public String NUM_LIGNEDefault(){
				
					return null;
				
				}
				public String NUM_LIGNEComment(){
				
				    return "";
				
				}
				public String NUM_LIGNEPattern(){
				
					return "";
				
				}
				public String NUM_LIGNEOriginalDbColumnName(){
				
					return "NUM_LIGNE";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CD_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CD_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_LIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_LIGNE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];

	
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}

				public Boolean CD_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean CD_CATEGORIEIsKey(){
				    return false;
				}
				public Integer CD_CATEGORIELength(){
				    return 0;
				}
				public Integer CD_CATEGORIEPrecision(){
				    return 0;
				}
				public String CD_CATEGORIEDefault(){
				
					return null;
				
				}
				public String CD_CATEGORIEComment(){
				
				    return "";
				
				}
				public String CD_CATEGORIEPattern(){
				
					return "";
				
				}
				public String CD_CATEGORIEOriginalDbColumnName(){
				
					return "CD_CATEGORIE";
				
				}

				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}

				public Boolean LB_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean LB_CATEGORIEIsKey(){
				    return false;
				}
				public Integer LB_CATEGORIELength(){
				    return 0;
				}
				public Integer LB_CATEGORIEPrecision(){
				    return 0;
				}
				public String LB_CATEGORIEDefault(){
				
					return null;
				
				}
				public String LB_CATEGORIEComment(){
				
				    return "";
				
				}
				public String LB_CATEGORIEPattern(){
				
					return "";
				
				}
				public String LB_CATEGORIEOriginalDbColumnName(){
				
					return "LB_CATEGORIE";
				
				}

				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}

				public Boolean NUM_LIGNEIsNullable(){
				    return true;
				}
				public Boolean NUM_LIGNEIsKey(){
				    return false;
				}
				public Integer NUM_LIGNELength(){
				    return null;
				}
				public Integer NUM_LIGNEPrecision(){
				    return null;
				}
				public String NUM_LIGNEDefault(){
				
					return null;
				
				}
				public String NUM_LIGNEComment(){
				
				    return "";
				
				}
				public String NUM_LIGNEPattern(){
				
					return "";
				
				}
				public String NUM_LIGNEOriginalDbColumnName(){
				
					return "NUM_LIGNE";
				
				}

				
			    public String errorMessage;

				public String getErrorMessage () {
					return this.errorMessage;
				}

				public Boolean errorMessageIsNullable(){
				    return true;
				}
				public Boolean errorMessageIsKey(){
				    return false;
				}
				public Integer errorMessageLength(){
				    return 255;
				}
				public Integer errorMessagePrecision(){
				    return 0;
				}
				public String errorMessageDefault(){
				
					return "";
				
				}
				public String errorMessageComment(){
				
				    return null;
				
				}
				public String errorMessagePattern(){
				
				    return null;
				
				}
				public String errorMessageOriginalDbColumnName(){
				
					return "errorMessage";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
					this.errorMessage = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
					this.errorMessage = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
					// String
				
						writeString(this.errorMessage,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
					// String
				
						writeString(this.errorMessage,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
		sb.append(",errorMessage="+errorMessage);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CD_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CD_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_LIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_LIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(errorMessage == null){
        					sb.append("<null>");
        				}else{
            				sb.append(errorMessage);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row5Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class CategorieStruct implements routines.system.IPersistableRow<CategorieStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];

	
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}

				public Boolean CD_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean CD_CATEGORIEIsKey(){
				    return false;
				}
				public Integer CD_CATEGORIELength(){
				    return 0;
				}
				public Integer CD_CATEGORIEPrecision(){
				    return 0;
				}
				public String CD_CATEGORIEDefault(){
				
					return null;
				
				}
				public String CD_CATEGORIEComment(){
				
				    return "";
				
				}
				public String CD_CATEGORIEPattern(){
				
					return "";
				
				}
				public String CD_CATEGORIEOriginalDbColumnName(){
				
					return "CD_CATEGORIE";
				
				}

				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}

				public Boolean LB_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean LB_CATEGORIEIsKey(){
				    return false;
				}
				public Integer LB_CATEGORIELength(){
				    return 0;
				}
				public Integer LB_CATEGORIEPrecision(){
				    return 0;
				}
				public String LB_CATEGORIEDefault(){
				
					return null;
				
				}
				public String LB_CATEGORIEComment(){
				
				    return "";
				
				}
				public String LB_CATEGORIEPattern(){
				
					return "";
				
				}
				public String LB_CATEGORIEOriginalDbColumnName(){
				
					return "LB_CATEGORIE";
				
				}

				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}

				public Boolean NUM_LIGNEIsNullable(){
				    return true;
				}
				public Boolean NUM_LIGNEIsKey(){
				    return false;
				}
				public Integer NUM_LIGNELength(){
				    return null;
				}
				public Integer NUM_LIGNEPrecision(){
				    return null;
				}
				public String NUM_LIGNEDefault(){
				
					return null;
				
				}
				public String NUM_LIGNEComment(){
				
				    return "";
				
				}
				public String NUM_LIGNEPattern(){
				
					return "";
				
				}
				public String NUM_LIGNEOriginalDbColumnName(){
				
					return "NUM_LIGNE";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CD_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CD_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_LIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_LIGNE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(CategorieStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];

	
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}

				public Boolean CD_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean CD_CATEGORIEIsKey(){
				    return false;
				}
				public Integer CD_CATEGORIELength(){
				    return 0;
				}
				public Integer CD_CATEGORIEPrecision(){
				    return 0;
				}
				public String CD_CATEGORIEDefault(){
				
					return null;
				
				}
				public String CD_CATEGORIEComment(){
				
				    return "";
				
				}
				public String CD_CATEGORIEPattern(){
				
					return "";
				
				}
				public String CD_CATEGORIEOriginalDbColumnName(){
				
					return "CD_CATEGORIE";
				
				}

				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}

				public Boolean LB_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean LB_CATEGORIEIsKey(){
				    return false;
				}
				public Integer LB_CATEGORIELength(){
				    return 0;
				}
				public Integer LB_CATEGORIEPrecision(){
				    return 0;
				}
				public String LB_CATEGORIEDefault(){
				
					return null;
				
				}
				public String LB_CATEGORIEComment(){
				
				    return "";
				
				}
				public String LB_CATEGORIEPattern(){
				
					return "";
				
				}
				public String LB_CATEGORIEOriginalDbColumnName(){
				
					return "LB_CATEGORIE";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CD_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CD_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class after_tFileInputDelimited_1Struct implements routines.system.IPersistableRow<after_tFileInputDelimited_1Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];

	
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}

				public Boolean CD_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean CD_CATEGORIEIsKey(){
				    return false;
				}
				public Integer CD_CATEGORIELength(){
				    return 0;
				}
				public Integer CD_CATEGORIEPrecision(){
				    return 0;
				}
				public String CD_CATEGORIEDefault(){
				
					return null;
				
				}
				public String CD_CATEGORIEComment(){
				
				    return "";
				
				}
				public String CD_CATEGORIEPattern(){
				
					return "";
				
				}
				public String CD_CATEGORIEOriginalDbColumnName(){
				
					return "CD_CATEGORIE";
				
				}

				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}

				public Boolean LB_CATEGORIEIsNullable(){
				    return true;
				}
				public Boolean LB_CATEGORIEIsKey(){
				    return false;
				}
				public Integer LB_CATEGORIELength(){
				    return 0;
				}
				public Integer LB_CATEGORIEPrecision(){
				    return 0;
				}
				public String LB_CATEGORIEDefault(){
				
					return null;
				
				}
				public String LB_CATEGORIEComment(){
				
				    return "";
				
				}
				public String LB_CATEGORIEPattern(){
				
					return "";
				
				}
				public String LB_CATEGORIEOriginalDbColumnName(){
				
					return "LB_CATEGORIE";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
					this.LB_CATEGORIE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
					// String
				
						writeString(this.LB_CATEGORIE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CD_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CD_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(after_tFileInputDelimited_1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputDelimited_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tDBInput_1Process(globalMap);

		row1Struct row1 = new row1Struct();
CategorieStruct Categorie = new CategorieStruct();
row2Struct row2 = new row2Struct();
row3Struct row3 = new row3Struct();
insertCategorieStruct insertCategorie = new insertCategorieStruct();
updateBlCurrentStruct updateBlCurrent = new updateBlCurrentStruct();
insertNewValueCategorieStruct insertNewValueCategorie = new insertNewValueCategorieStruct();
row6Struct row6 = new row6Struct();
insertDuplicateStruct insertDuplicate = new insertDuplicateStruct();
row5Struct row5 = new row5Struct();
insertRejectStruct insertReject = new insertRejectStruct();








	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_1</b>";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"insertCategorie");
			
		int tos_count_tDBOutput_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_1 = new StringBuilder();
                    log4jParamters_tDBOutput_1.append("Parameters:");
                            log4jParamters_tDBOutput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE" + " = " + "\"ODS_CATEGORIE\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("CONVERT_COLUMN_TABLE_TO_LOWERCASE" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("USE_BATCH_SIZE" + " = " + "true");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("BATCH_SIZE" + " = " + "10000");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("UNIFIED_COMPONENTS" + " = " + "tPostgresqlOutput");
                        log4jParamters_tDBOutput_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + (log4jParamters_tDBOutput_1) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_1", "\"ODS_CATEGORIE\"<br>    <b>tDBOutput_1</b>", "tPostgresqlOutput");
				talendJobLogProcess(globalMap);
			}
			





String dbschema_tDBOutput_1 = null;
	dbschema_tDBOutput_1 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_1 = null;
if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
	tableName_tDBOutput_1 = ("ODS_CATEGORIE");
} else {
	tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("ODS_CATEGORIE");
}


int nb_line_tDBOutput_1 = 0;
int nb_line_update_tDBOutput_1 = 0;
int nb_line_inserted_tDBOutput_1 = 0;
int nb_line_deleted_tDBOutput_1 = 0;
int nb_line_rejected_tDBOutput_1 = 0;

int deletedCount_tDBOutput_1=0;
int updatedCount_tDBOutput_1=0;
int insertedCount_tDBOutput_1=0;
int rowsToCommitCount_tDBOutput_1=0;
int rejectedCount_tDBOutput_1=0;

boolean whetherReject_tDBOutput_1 = false;

java.sql.Connection conn_tDBOutput_1 = null;
String dbUser_tDBOutput_1 = null;

	conn_tDBOutput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_1.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_1.getMetaData().getURL())  + (".") );
	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_1.getAutoCommit())  + ("'.") );


   int batchSize_tDBOutput_1 = 10000;
   int batchSizeCounter_tDBOutput_1=0;

int count_tDBOutput_1=0;
        java.lang.StringBuilder sb_tDBOutput_1 = new java.lang.StringBuilder();
        sb_tDBOutput_1.append("INSERT INTO \"").append(tableName_tDBOutput_1).append("\" (\"CD_CATEGORIE\",\"LB_CATEGORIE\",\"LB_NOM_FICHIER\",\"DT_INSERTION\",\"BL_LIGNE_ACTIVE\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?)");

        String insert_tDBOutput_1 = sb_tDBOutput_1.toString();
        
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Executing '")  + (insert_tDBOutput_1)  + ("'.") );
        
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
	    resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    

 



/**
 * [tDBOutput_1 begin ] stop
 */




	
	/**
	 * [tDBOutput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_3", false);
		start_Hash.put("tDBOutput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_3";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_3</b>";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"updateBlCurrent");
			
		int tos_count_tDBOutput_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_3 = new StringBuilder();
                    log4jParamters_tDBOutput_3.append("Parameters:");
                            log4jParamters_tDBOutput_3.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("TABLE" + " = " + "\"ODS_CATEGORIE\"");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("DATA_ACTION" + " = " + "UPDATE");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("CONVERT_COLUMN_TABLE_TO_LOWERCASE" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("USE_BATCH_SIZE" + " = " + "true");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("BATCH_SIZE" + " = " + "10000");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("UNIFIED_COMPONENTS" + " = " + "tPostgresqlOutput");
                        log4jParamters_tDBOutput_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + (log4jParamters_tDBOutput_3) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_3", "\"ODS_CATEGORIE\"<br>    <b>tDBOutput_3</b>", "tPostgresqlOutput");
				talendJobLogProcess(globalMap);
			}
			





String dbschema_tDBOutput_3 = null;
	dbschema_tDBOutput_3 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_3 = null;
if(dbschema_tDBOutput_3 == null || dbschema_tDBOutput_3.trim().length() == 0) {
	tableName_tDBOutput_3 = ("ODS_CATEGORIE");
} else {
	tableName_tDBOutput_3 = dbschema_tDBOutput_3 + "\".\"" + ("ODS_CATEGORIE");
}

        int updateKeyCount_tDBOutput_3 = 1;
        if(updateKeyCount_tDBOutput_3 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_3 == 2 && true) {        
                throw new RuntimeException("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_3 = 0;
int nb_line_update_tDBOutput_3 = 0;
int nb_line_inserted_tDBOutput_3 = 0;
int nb_line_deleted_tDBOutput_3 = 0;
int nb_line_rejected_tDBOutput_3 = 0;

int deletedCount_tDBOutput_3=0;
int updatedCount_tDBOutput_3=0;
int insertedCount_tDBOutput_3=0;
int rowsToCommitCount_tDBOutput_3=0;
int rejectedCount_tDBOutput_3=0;

boolean whetherReject_tDBOutput_3 = false;

java.sql.Connection conn_tDBOutput_3 = null;
String dbUser_tDBOutput_3 = null;

	conn_tDBOutput_3 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_3.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_3.getMetaData().getURL())  + (".") );
	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_3.getAutoCommit())  + ("'.") );


   int batchSize_tDBOutput_3 = 10000;
   int batchSizeCounter_tDBOutput_3=0;

int count_tDBOutput_3=0;
	    String update_tDBOutput_3 = "UPDATE \"" + tableName_tDBOutput_3 + "\" SET \"BL_LIGNE_ACTIVE\" = ? WHERE \"CD_CATEGORIE\" = ?";
	    java.sql.PreparedStatement pstmt_tDBOutput_3 = conn_tDBOutput_3.prepareStatement(update_tDBOutput_3);
	    resourceMap.put("pstmt_tDBOutput_3", pstmt_tDBOutput_3);
	    

 



/**
 * [tDBOutput_3 begin ] stop
 */




	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_2</b>";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"insertNewValueCategorie");
			
		int tos_count_tDBOutput_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_2 = new StringBuilder();
                    log4jParamters_tDBOutput_2.append("Parameters:");
                            log4jParamters_tDBOutput_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TABLE" + " = " + "\"ODS_CATEGORIE\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("CONVERT_COLUMN_TABLE_TO_LOWERCASE" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("USE_BATCH_SIZE" + " = " + "true");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("BATCH_SIZE" + " = " + "10000");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("UNIFIED_COMPONENTS" + " = " + "tPostgresqlOutput");
                        log4jParamters_tDBOutput_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + (log4jParamters_tDBOutput_2) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_2", "\"ODS_CATEGORIE\"<br>    <b>tDBOutput_2</b>", "tPostgresqlOutput");
				talendJobLogProcess(globalMap);
			}
			





String dbschema_tDBOutput_2 = null;
	dbschema_tDBOutput_2 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_2 = null;
if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
	tableName_tDBOutput_2 = ("ODS_CATEGORIE");
} else {
	tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "\".\"" + ("ODS_CATEGORIE");
}


int nb_line_tDBOutput_2 = 0;
int nb_line_update_tDBOutput_2 = 0;
int nb_line_inserted_tDBOutput_2 = 0;
int nb_line_deleted_tDBOutput_2 = 0;
int nb_line_rejected_tDBOutput_2 = 0;

int deletedCount_tDBOutput_2=0;
int updatedCount_tDBOutput_2=0;
int insertedCount_tDBOutput_2=0;
int rowsToCommitCount_tDBOutput_2=0;
int rejectedCount_tDBOutput_2=0;

boolean whetherReject_tDBOutput_2 = false;

java.sql.Connection conn_tDBOutput_2 = null;
String dbUser_tDBOutput_2 = null;

	conn_tDBOutput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_2.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_2.getMetaData().getURL())  + (".") );
	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_2.getAutoCommit())  + ("'.") );


   int batchSize_tDBOutput_2 = 10000;
   int batchSizeCounter_tDBOutput_2=0;

int count_tDBOutput_2=0;
        java.lang.StringBuilder sb_tDBOutput_2 = new java.lang.StringBuilder();
        sb_tDBOutput_2.append("INSERT INTO \"").append(tableName_tDBOutput_2).append("\" (\"CD_CATEGORIE\",\"LB_CATEGORIE\",\"LB_NOM_FICHIER\",\"DT_INSERTION\",\"BL_LIGNE_ACTIVE\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?)");

        String insert_tDBOutput_2 = sb_tDBOutput_2.toString();
        
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Executing '")  + (insert_tDBOutput_2)  + ("'.") );
        
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(insert_tDBOutput_2);
	    resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);
	    

 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";
	
	
			cLabel="  Mapping<br>   <b>tMap_2</b>";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row3");
			
		int tos_count_tMap_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_2 = new StringBuilder();
                    log4jParamters_tMap_2.append("Parameters:");
                            log4jParamters_tMap_2.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_2.append(" | ");
                            log4jParamters_tMap_2.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_2.append(" | ");
                            log4jParamters_tMap_2.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_2.append(" | ");
                            log4jParamters_tMap_2.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + (log4jParamters_tMap_2) );
                    } 
                } 
            new BytesLimit65535_tMap_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_2", "  Mapping<br>   <b>tMap_2</b>", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row3_tMap_2 = 0;
		
		int count_row4_tMap_2 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
					globalMap.get( "tHash_Lookup_row4" ))
					;					
					
	

row4Struct row4HashKey = new row4Struct();
row4Struct row4Default = new row4Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_insertCategorie_tMap_2 = 0;
				
insertCategorieStruct insertCategorie_tmp = new insertCategorieStruct();
				int count_updateBlCurrent_tMap_2 = 0;
				
updateBlCurrentStruct updateBlCurrent_tmp = new updateBlCurrentStruct();
				int count_insertNewValueCategorie_tMap_2 = 0;
				
insertNewValueCategorieStruct insertNewValueCategorie_tmp = new insertNewValueCategorieStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */





	
	/**
	 * [tDBOutput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_5", false);
		start_Hash.put("tDBOutput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_5";
	
	
			cLabel=" \"ODS_REJET\"<br><b>tDBOutput_5</b>";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"insertDuplicate");
			
		int tos_count_tDBOutput_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_5 = new StringBuilder();
                    log4jParamters_tDBOutput_5.append("Parameters:");
                            log4jParamters_tDBOutput_5.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("TABLE" + " = " + "\"ODS_REJET\"");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("DATA_ACTION" + " = " + "INSERT_OR_UPDATE");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("CONVERT_COLUMN_TABLE_TO_LOWERCASE" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("UNIFIED_COMPONENTS" + " = " + "tPostgresqlOutput");
                        log4jParamters_tDBOutput_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + (log4jParamters_tDBOutput_5) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_5", " \"ODS_REJET\"<br><b>tDBOutput_5</b>", "tPostgresqlOutput");
				talendJobLogProcess(globalMap);
			}
			





String dbschema_tDBOutput_5 = null;
	dbschema_tDBOutput_5 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_5 = null;
if(dbschema_tDBOutput_5 == null || dbschema_tDBOutput_5.trim().length() == 0) {
	tableName_tDBOutput_5 = ("ODS_REJET");
} else {
	tableName_tDBOutput_5 = dbschema_tDBOutput_5 + "\".\"" + ("ODS_REJET");
}

        int updateKeyCount_tDBOutput_5 = 4;
        if(updateKeyCount_tDBOutput_5 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_5 == 8 && true) {
                    log.warn("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_5 = 0;
int nb_line_update_tDBOutput_5 = 0;
int nb_line_inserted_tDBOutput_5 = 0;
int nb_line_deleted_tDBOutput_5 = 0;
int nb_line_rejected_tDBOutput_5 = 0;

int deletedCount_tDBOutput_5=0;
int updatedCount_tDBOutput_5=0;
int insertedCount_tDBOutput_5=0;
int rowsToCommitCount_tDBOutput_5=0;
int rejectedCount_tDBOutput_5=0;

boolean whetherReject_tDBOutput_5 = false;

java.sql.Connection conn_tDBOutput_5 = null;
String dbUser_tDBOutput_5 = null;

	conn_tDBOutput_5 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_5.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_5.getMetaData().getURL())  + (".") );
	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_5.getAutoCommit())  + ("'.") );



int count_tDBOutput_5=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_5 = conn_tDBOutput_5.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_5 + "\" WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?");
	    resourceMap.put("pstmt_tDBOutput_5", pstmt_tDBOutput_5);
	    String insert_tDBOutput_5 = "INSERT INTO \"" + tableName_tDBOutput_5 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_5 = conn_tDBOutput_5.prepareStatement(insert_tDBOutput_5);
	    resourceMap.put("pstmtInsert_tDBOutput_5", pstmtInsert_tDBOutput_5);
	    String update_tDBOutput_5 = "UPDATE \"" + tableName_tDBOutput_5 + "\" SET \"LB_MESSAGE_REJET\" = ?,\"LB_NOM_FLUX\" = ?,\"DT_REJET\" = ?,\"LB_JOB_NAME\" = ? WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_5 = conn_tDBOutput_5.prepareStatement(update_tDBOutput_5);
	    resourceMap.put("pstmtUpdate_tDBOutput_5", pstmtUpdate_tDBOutput_5);
	    

 



/**
 * [tDBOutput_5 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";
	
	
			cLabel=" Ajout Valeurs en double<br>              <b>tMap_4</b>";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row6");
			
		int tos_count_tMap_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_4 = new StringBuilder();
                    log4jParamters_tMap_4.append("Parameters:");
                            log4jParamters_tMap_4.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + (log4jParamters_tMap_4) );
                    } 
                } 
            new BytesLimit65535_tMap_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_4", " Ajout Valeurs en double<br>              <b>tMap_4</b>", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row6_tMap_4 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_insertDuplicate_tMap_4 = 0;
				
insertDuplicateStruct insertDuplicate_tmp = new insertDuplicateStruct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */



	
	/**
	 * [tUniqRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tUniqRow_1", false);
		start_Hash.put("tUniqRow_1", System.currentTimeMillis());
		
	
	currentComponent="tUniqRow_1";
	
	
			cLabel="           Suppression des doublons<br>                    <b>tUniqRow_1</b>";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row2");
			
		int tos_count_tUniqRow_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tUniqRow_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tUniqRow_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tUniqRow_1 = new StringBuilder();
                    log4jParamters_tUniqRow_1.append("Parameters:");
                            log4jParamters_tUniqRow_1.append("UNIQUE_KEY" + " = " + "[{CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("true")+", SCHEMA_COLUMN="+("CD_CATEGORIE")+"}, {CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("false")+", SCHEMA_COLUMN="+("LB_CATEGORIE")+"}, {CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("false")+", SCHEMA_COLUMN="+("NUM_LIGNE")+"}]");
                        log4jParamters_tUniqRow_1.append(" | ");
                            log4jParamters_tUniqRow_1.append("ONLY_ONCE_EACH_DUPLICATED_KEY" + " = " + "false");
                        log4jParamters_tUniqRow_1.append(" | ");
                            log4jParamters_tUniqRow_1.append("IS_VIRTUAL_COMPONENT" + " = " + "false");
                        log4jParamters_tUniqRow_1.append(" | ");
                            log4jParamters_tUniqRow_1.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "false");
                        log4jParamters_tUniqRow_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tUniqRow_1 - "  + (log4jParamters_tUniqRow_1) );
                    } 
                } 
            new BytesLimit65535_tUniqRow_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tUniqRow_1", "           Suppression des doublons<br>                    <b>tUniqRow_1</b>", "tUniqRow");
				talendJobLogProcess(globalMap);
			}
			

	
		class KeyStruct_tUniqRow_1 {
	
			private static final int DEFAULT_HASHCODE = 1;
		    private static final int PRIME = 31;
		    private int hashCode = DEFAULT_HASHCODE;
		    public boolean hashCodeDirty = true;
	
	        
					String CD_CATEGORIE;        
	        
		    @Override
			public int hashCode() {
				if (this.hashCodeDirty) {
					final int prime = PRIME;
					int result = DEFAULT_HASHCODE;
			
								result = prime * result + ((this.CD_CATEGORIE == null) ? 0 : this.CD_CATEGORIE.hashCode());
								
		    		this.hashCode = result;
		    		this.hashCodeDirty = false;		
				}
				return this.hashCode;
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj) return true;
				if (obj == null) return false;
				if (getClass() != obj.getClass()) return false;
				final KeyStruct_tUniqRow_1 other = (KeyStruct_tUniqRow_1) obj;
				
									if (this.CD_CATEGORIE == null) {
										if (other.CD_CATEGORIE != null) 
											return false;
								
									} else if (!this.CD_CATEGORIE.equals(other.CD_CATEGORIE))
								 
										return false;
								
				
				return true;
			}
	  
	        
		}

	
int nb_uniques_tUniqRow_1 = 0;
int nb_duplicates_tUniqRow_1 = 0;
	log.debug("tUniqRow_1 - Start to process the data from datasource.");
KeyStruct_tUniqRow_1 finder_tUniqRow_1 = new KeyStruct_tUniqRow_1();
java.util.Set<KeyStruct_tUniqRow_1> keystUniqRow_1 = new java.util.HashSet<KeyStruct_tUniqRow_1>(); 

 



/**
 * [tUniqRow_1 begin ] stop
 */





	
	/**
	 * [tDBOutput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_4", false);
		start_Hash.put("tDBOutput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_4";
	
	
			cLabel="\"ODS_REJET\"<br><b>tDBOutput_4</b>";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"insertReject");
			
		int tos_count_tDBOutput_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_4 = new StringBuilder();
                    log4jParamters_tDBOutput_4.append("Parameters:");
                            log4jParamters_tDBOutput_4.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("TABLE" + " = " + "\"ODS_REJET\"");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("DATA_ACTION" + " = " + "INSERT_OR_UPDATE");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("CONVERT_COLUMN_TABLE_TO_LOWERCASE" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("UNIFIED_COMPONENTS" + " = " + "tPostgresqlOutput");
                        log4jParamters_tDBOutput_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + (log4jParamters_tDBOutput_4) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_4", "\"ODS_REJET\"<br><b>tDBOutput_4</b>", "tPostgresqlOutput");
				talendJobLogProcess(globalMap);
			}
			





String dbschema_tDBOutput_4 = null;
	dbschema_tDBOutput_4 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_4 = null;
if(dbschema_tDBOutput_4 == null || dbschema_tDBOutput_4.trim().length() == 0) {
	tableName_tDBOutput_4 = ("ODS_REJET");
} else {
	tableName_tDBOutput_4 = dbschema_tDBOutput_4 + "\".\"" + ("ODS_REJET");
}

        int updateKeyCount_tDBOutput_4 = 4;
        if(updateKeyCount_tDBOutput_4 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_4 == 8 && true) {
                    log.warn("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_4 = 0;
int nb_line_update_tDBOutput_4 = 0;
int nb_line_inserted_tDBOutput_4 = 0;
int nb_line_deleted_tDBOutput_4 = 0;
int nb_line_rejected_tDBOutput_4 = 0;

int deletedCount_tDBOutput_4=0;
int updatedCount_tDBOutput_4=0;
int insertedCount_tDBOutput_4=0;
int rowsToCommitCount_tDBOutput_4=0;
int rejectedCount_tDBOutput_4=0;

boolean whetherReject_tDBOutput_4 = false;

java.sql.Connection conn_tDBOutput_4 = null;
String dbUser_tDBOutput_4 = null;

	conn_tDBOutput_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_4.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_4.getMetaData().getURL())  + (".") );
	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_4.getAutoCommit())  + ("'.") );



int count_tDBOutput_4=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_4 = conn_tDBOutput_4.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_4 + "\" WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?");
	    resourceMap.put("pstmt_tDBOutput_4", pstmt_tDBOutput_4);
	    String insert_tDBOutput_4 = "INSERT INTO \"" + tableName_tDBOutput_4 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(insert_tDBOutput_4);
	    resourceMap.put("pstmtInsert_tDBOutput_4", pstmtInsert_tDBOutput_4);
	    String update_tDBOutput_4 = "UPDATE \"" + tableName_tDBOutput_4 + "\" SET \"LB_MESSAGE_REJET\" = ?,\"LB_NOM_FLUX\" = ?,\"DT_REJET\" = ?,\"LB_JOB_NAME\" = ? WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(update_tDBOutput_4);
	    resourceMap.put("pstmtUpdate_tDBOutput_4", pstmtUpdate_tDBOutput_4);
	    

 



/**
 * [tDBOutput_4 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";
	
	
			cLabel="Ajout valeurs nulles<br>          <b>tMap_3</b>";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row5");
			
		int tos_count_tMap_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_3 = new StringBuilder();
                    log4jParamters_tMap_3.append("Parameters:");
                            log4jParamters_tMap_3.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + (log4jParamters_tMap_3) );
                    } 
                } 
            new BytesLimit65535_tMap_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_3", "Ajout valeurs nulles<br>          <b>tMap_3</b>", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row5_tMap_3 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_insertReject_tMap_3 = 0;
				
insertRejectStruct insertReject_tmp = new insertRejectStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tFilterRow_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFilterRow_2", false);
		start_Hash.put("tFilterRow_2", System.currentTimeMillis());
		
	
	currentComponent="tFilterRow_2";
	
	
			cLabel="Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Categorie");
			
		int tos_count_tFilterRow_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFilterRow_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFilterRow_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFilterRow_2 = new StringBuilder();
                    log4jParamters_tFilterRow_2.append("Parameters:");
                            log4jParamters_tFilterRow_2.append("LOGICAL_OP" + " = " + "&&");
                        log4jParamters_tFilterRow_2.append(" | ");
                            log4jParamters_tFilterRow_2.append("CONDITIONS" + " = " + "[]");
                        log4jParamters_tFilterRow_2.append(" | ");
                            log4jParamters_tFilterRow_2.append("USE_ADVANCED" + " = " + "true");
                        log4jParamters_tFilterRow_2.append(" | ");
                            log4jParamters_tFilterRow_2.append("ADVANCED_COND" + " = " + "// code sample : use input_row to define the condition. // input_row.columnName1.equals(\"foo\") ||!(input_row.columnName2.equals(\"bar\")) // replace the following expression by your own filter condition  !input_row.CD_CATEGORIE.isEmpty() && !input_row.LB_CATEGORIE.isEmpty()");
                        log4jParamters_tFilterRow_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFilterRow_2 - "  + (log4jParamters_tFilterRow_2) );
                    } 
                } 
            new BytesLimit65535_tFilterRow_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFilterRow_2", "Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>", "tFilterRow");
				talendJobLogProcess(globalMap);
			}
			
    int nb_line_tFilterRow_2 = 0;
    int nb_line_ok_tFilterRow_2 = 0;
    int nb_line_reject_tFilterRow_2 = 0;

    class Operator_tFilterRow_2 {
      private String sErrorMsg = "";
      private boolean bMatchFlag = true;
      private String sUnionFlag = "&&";

      public Operator_tFilterRow_2(String unionFlag){
        sUnionFlag = unionFlag;
        bMatchFlag =  "||".equals(unionFlag) ? false : true;
      }

      public String getErrorMsg() {
        if (sErrorMsg != null && sErrorMsg.length() > 1)
          return sErrorMsg.substring(1);
        else 
          return null;
      }

      public boolean getMatchFlag() {
        return bMatchFlag;
      }

      public void matches(boolean partMatched, String reason) {
        // no need to care about the next judgement
        if ("||".equals(sUnionFlag) && bMatchFlag){
          return;
        }

        if (!partMatched) {
          sErrorMsg += "|" + reason;
        }

        if ("||".equals(sUnionFlag))
          bMatchFlag = bMatchFlag || partMatched;
        else
          bMatchFlag = bMatchFlag && partMatched;
      }
    }

 



/**
 * [tFilterRow_2 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";
	
	
			cLabel="Ajout N\u00B0Ligne<br>      <b>tMap_1</b>";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row1");
			
		int tos_count_tMap_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_1 = new StringBuilder();
                    log4jParamters_tMap_1.append("Parameters:");
                            log4jParamters_tMap_1.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_1.append(" | ");
                            log4jParamters_tMap_1.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_1.append(" | ");
                            log4jParamters_tMap_1.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_1.append(" | ");
                            log4jParamters_tMap_1.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + (log4jParamters_tMap_1) );
                    } 
                } 
            new BytesLimit65535_tMap_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_1", "Ajout N\u00B0Ligne<br>      <b>tMap_1</b>", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row1_tMap_1 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_Categorie_tMap_1 = 0;
				
CategorieStruct Categorie_tmp = new CategorieStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_1", false);
		start_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_1";
	
	
			cLabel="         CATEGORIE<br>  <b>tFileInputDelimited_1</b>";
		
		int tos_count_tFileInputDelimited_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileInputDelimited_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileInputDelimited_1 = new StringBuilder();
                    log4jParamters_tFileInputDelimited_1.append("Parameters:");
                            log4jParamters_tFileInputDelimited_1.append("FILENAME" + " = " + "((String)globalMap.get(\"tFileList_1_CURRENT_FILEPATH\"))");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("FIELDSEPARATOR" + " = " + "context.fieldSeparator");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("HEADER" + " = " + "1");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("FOOTER" + " = " + "0");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("LIMIT" + " = " + "");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("REMOVE_EMPTY_ROW" + " = " + "true");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("UNCOMPRESS" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("RANDOM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("TRIMALL" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("CD_CATEGORIE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LB_CATEGORIE")+"}]");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("CHECK_FIELDS_NUM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("CHECK_DATE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ENCODING" + " = " + "context.encodage");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("SPLITRECORD" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ENABLE_DECODE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + (log4jParamters_tFileInputDelimited_1) );
                    } 
                } 
            new BytesLimit65535_tFileInputDelimited_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileInputDelimited_1", "         CATEGORIE<br>  <b>tFileInputDelimited_1</b>", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_1 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_1 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				int limit_tFileInputDelimited_1 = -1;
				try{
					
						Object filename_tFileInputDelimited_1 = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
						if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_1 = 0, random_value_tFileInputDelimited_1 = -1;
			if(footer_value_tFileInputDelimited_1 >0 || random_value_tFileInputDelimited_1 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(((String)globalMap.get("tFileList_1_CURRENT_FILEPATH")), context.encodage,context.fieldSeparator,"\n",true,1,0,
									limit_tFileInputDelimited_1
								,-1, false);
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
							
								
									log.error("tFileInputDelimited_1 - " +e.getMessage());
								
								System.err.println(e.getMessage());
							
						}
					
				    
				    	log.info("tFileInputDelimited_1 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_1!=null && fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();
						
			    						row1 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row1 = new row1Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					columnIndexWithD_tFileInputDelimited_1 = 0;
					
							row1.CD_CATEGORIE = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 1;
					
							row1.LB_CATEGORIE = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
				
										
										if(rowstate_tFileInputDelimited_1.getException()!=null) {
											throw rowstate_tFileInputDelimited_1.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_1 = true;
			        					
												log.error("tFileInputDelimited_1 - " +e.getMessage());
											
			                					System.err.println(e.getMessage());
			                					row1 = null;
			                				
										
			    					}
								
			log.debug("tFileInputDelimited_1 - Retrieving the record " + fid_tFileInputDelimited_1.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_1 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";
	
	
			cLabel="         CATEGORIE<br>  <b>tFileInputDelimited_1</b>";
		

 


	tos_count_tFileInputDelimited_1++;

/**
 * [tFileInputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";
	
	
			cLabel="         CATEGORIE<br>  <b>tFileInputDelimited_1</b>";
		

 



/**
 * [tFileInputDelimited_1 process_data_begin ] stop
 */
// Start of branch "row1"
if(row1 != null) { 
			row5 = null;



	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
			cLabel="Ajout N\u00B0Ligne<br>      <b>tMap_1</b>";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row1","tFileInputDelimited_1","         CATEGORIE<br>  <b>tFileInputDelimited_1</b>","tFileInputDelimited","tMap_1","Ajout N\u00B0Ligne<br>      <b>tMap_1</b>","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_1 = false;
		boolean mainRowRejected_tMap_1 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

Categorie = null;


// # Output table : 'Categorie'
count_Categorie_tMap_1++;

Categorie_tmp.CD_CATEGORIE = row1.CD_CATEGORIE ;
Categorie_tmp.LB_CATEGORIE = row1.LB_CATEGORIE ;
Categorie_tmp.NUM_LIGNE = Numeric.sequence("s1",1,1) ;
Categorie = Categorie_tmp;
log.debug("tMap_1 - Outputting the record " + count_Categorie_tMap_1 + " of the output table 'Categorie'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_1 = false;










 


	tos_count_tMap_1++;

/**
 * [tMap_1 main ] stop
 */
	
	/**
	 * [tMap_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
			cLabel="Ajout N\u00B0Ligne<br>      <b>tMap_1</b>";
		

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "Categorie"
if(Categorie != null) { 
			row5 = null;



	
	/**
	 * [tFilterRow_2 main ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";
	
	
			cLabel="Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"Categorie","tMap_1","Ajout N\u00B0Ligne<br>      <b>tMap_1</b>","tMap","tFilterRow_2","Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>","tFilterRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("Categorie - " + (Categorie==null? "": Categorie.toLogString()));
    			}
    		

          row5 = null;
          row2 = null;
    Operator_tFilterRow_2 ope_tFilterRow_2 = new Operator_tFilterRow_2("&&");
      ope_tFilterRow_2.matches((// code sample : use Categorie to define the condition.
// Categorie.columnName1.equals("foo") ||!(Categorie.columnName2.equals("bar"))
// replace the following expression by your own filter condition 
!Categorie.CD_CATEGORIE.isEmpty() && !Categorie.LB_CATEGORIE.isEmpty()), "advanced condition failed");
    
    if (ope_tFilterRow_2.getMatchFlag()) {
              if(row2 == null){ 
                row2 = new row2Struct();
              }
               row2.CD_CATEGORIE = Categorie.CD_CATEGORIE;
               row2.LB_CATEGORIE = Categorie.LB_CATEGORIE;
               row2.NUM_LIGNE = Categorie.NUM_LIGNE;
					log.debug("tFilterRow_2 - Process the record " + (nb_line_tFilterRow_2+1) + ".");
					    
      nb_line_ok_tFilterRow_2++;
    } else {
            if (row5 == null){
              row5 = new row5Struct();
            }
                row5.CD_CATEGORIE = Categorie.CD_CATEGORIE;
                row5.LB_CATEGORIE = Categorie.LB_CATEGORIE;
                row5.NUM_LIGNE = Categorie.NUM_LIGNE;
	            row5.errorMessage = ope_tFilterRow_2.getErrorMsg();
					log.debug("tFilterRow_2 - Process the record " + (nb_line_tFilterRow_2+1) + ".");
					
					log.debug("tFilterRow_2 - Reject the record " + (nb_line_tFilterRow_2+1) + ". Caused by: " + row5.errorMessage+ ".");
					
      nb_line_reject_tFilterRow_2++;
    }

nb_line_tFilterRow_2++;

 


	tos_count_tFilterRow_2++;

/**
 * [tFilterRow_2 main ] stop
 */
	
	/**
	 * [tFilterRow_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";
	
	
			cLabel="Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>";
		

 



/**
 * [tFilterRow_2 process_data_begin ] stop
 */
// Start of branch "row2"
if(row2 != null) { 



	
	/**
	 * [tUniqRow_1 main ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";
	
	
			cLabel="           Suppression des doublons<br>                    <b>tUniqRow_1</b>";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row2","tFilterRow_2","Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>","tFilterRow","tUniqRow_1","           Suppression des doublons<br>                    <b>tUniqRow_1</b>","tUniqRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		
row6 = null;			row3 = null;			
if(row2.CD_CATEGORIE == null){
	finder_tUniqRow_1.CD_CATEGORIE = null;
}else{
	finder_tUniqRow_1.CD_CATEGORIE = row2.CD_CATEGORIE.toLowerCase();
}	
finder_tUniqRow_1.hashCodeDirty = true;
if (!keystUniqRow_1.contains(finder_tUniqRow_1)) {
		KeyStruct_tUniqRow_1 new_tUniqRow_1 = new KeyStruct_tUniqRow_1();

		
if(row2.CD_CATEGORIE == null){
	new_tUniqRow_1.CD_CATEGORIE = null;
}else{
	new_tUniqRow_1.CD_CATEGORIE = row2.CD_CATEGORIE.toLowerCase();
}
		
		keystUniqRow_1.add(new_tUniqRow_1);if(row3 == null){ 
	
		log.trace("tUniqRow_1 - Writing the unique record " + (nb_uniques_tUniqRow_1+1) + " into row3.");
	
	row3 = new row3Struct();
}row3.CD_CATEGORIE = row2.CD_CATEGORIE;			row3.LB_CATEGORIE = row2.LB_CATEGORIE;			row3.NUM_LIGNE = row2.NUM_LIGNE;					
		nb_uniques_tUniqRow_1++;
	} else {
if(row6 == null){ 
	
		log.trace("tUniqRow_1 - Writing the duplicate record " + (nb_duplicates_tUniqRow_1+1) + " into row6.");
	
	row6 = new row6Struct();
}				row6.CD_CATEGORIE = row2.CD_CATEGORIE;			row6.LB_CATEGORIE = row2.LB_CATEGORIE;			row6.NUM_LIGNE = row2.NUM_LIGNE;			
	  nb_duplicates_tUniqRow_1++;
	}

 


	tos_count_tUniqRow_1++;

/**
 * [tUniqRow_1 main ] stop
 */
	
	/**
	 * [tUniqRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";
	
	
			cLabel="           Suppression des doublons<br>                    <b>tUniqRow_1</b>";
		

 



/**
 * [tUniqRow_1 process_data_begin ] stop
 */
// Start of branch "row3"
if(row3 != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	
			cLabel="  Mapping<br>   <b>tMap_2</b>";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row3","tUniqRow_1","           Suppression des doublons<br>                    <b>tUniqRow_1</b>","tUniqRow","tMap_2","  Mapping<br>   <b>tMap_2</b>","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row3 - " + (row3==null? "": row3.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		
						row4Struct row4 = null;
					
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_2 = false;
		boolean mainRowRejected_tMap_2 = false;
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row4" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow4 = false;
       		  	    	
       		  	    	
 							row4Struct row4ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_2 = false;
								
                        		    		    row4HashKey.CD_CATEGORIE = row3.CD_CATEGORIE ;
                        		    		

								
		                        	row4HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row4.lookup( row4HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row4.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_2 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row4 != null && tHash_Lookup_row4.getCount(row4HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row4' and it contains more one result from keys :  row4.CD_CATEGORIE = '" + row4HashKey.CD_CATEGORIE + "'");
								} // G 071
							

							
                    		  	 
							   
                    		  	 
	       		  	    	row4Struct fromLookup_row4 = null;
							row4 = row4Default;
										 
							
								 
							
							
								if (tHash_Lookup_row4 !=null && tHash_Lookup_row4.hasNext()) { // G 099
								
							
								
								fromLookup_row4 = tHash_Lookup_row4.next();

							
							
								} // G 099
							
							

							if(fromLookup_row4 != null) {
								row4 = fromLookup_row4;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

updateBlCurrent = null;
insertNewValueCategorie = null;
insertCategorie = null;

if(!rejectedInnerJoin_tMap_2 ) {

// # Output table : 'updateBlCurrent'
// # Filter conditions 
if( 

!row3.LB_CATEGORIE.equals(row4.LB_CATEGORIE) 

 ) {
count_updateBlCurrent_tMap_2++;

updateBlCurrent_tmp.CD_CATEGORIE = row3.CD_CATEGORIE ;
updateBlCurrent_tmp.BL_LIGNE_ACTIVE = 0;
updateBlCurrent = updateBlCurrent_tmp;
log.debug("tMap_2 - Outputting the record " + count_updateBlCurrent_tMap_2 + " of the output table 'updateBlCurrent'.");

} // closing filter/reject

// # Output table : 'insertNewValueCategorie'
// # Filter conditions 
if( 

!row3.LB_CATEGORIE.equals(row4.LB_CATEGORIE)

 ) {
count_insertNewValueCategorie_tMap_2++;

insertNewValueCategorie_tmp.CD_CATEGORIE = row3.CD_CATEGORIE ;
insertNewValueCategorie_tmp.LB_CATEGORIE = row3.LB_CATEGORIE ;
insertNewValueCategorie_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
insertNewValueCategorie_tmp.DT_INSERTION = TalendDate.getCurrentDate();
insertNewValueCategorie_tmp.BL_LIGNE_ACTIVE = 1;
insertNewValueCategorie_tmp.LB_JOB_NAME = jobName;
insertNewValueCategorie = insertNewValueCategorie_tmp;
log.debug("tMap_2 - Outputting the record " + count_insertNewValueCategorie_tMap_2 + " of the output table 'insertNewValueCategorie'.");

} // closing filter/reject
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'insertCategorie'
// # Filter conditions 
if( rejectedInnerJoin_tMap_2 ) {
count_insertCategorie_tMap_2++;

insertCategorie_tmp.CD_CATEGORIE = row3.CD_CATEGORIE ;
insertCategorie_tmp.LB_CATEGORIE = row3.LB_CATEGORIE ;
insertCategorie_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
insertCategorie_tmp.DT_INSERTION = TalendDate.getCurrentDate() ;
insertCategorie_tmp.BL_LIGNE_ACTIVE = 1;
insertCategorie_tmp.LB_JOB_NAME = jobName;
insertCategorie = insertCategorie_tmp;
log.debug("tMap_2 - Outputting the record " + count_insertCategorie_tMap_2 + " of the output table 'insertCategorie'.");

} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_2 = false;










 


	tos_count_tMap_2++;

/**
 * [tMap_2 main ] stop
 */
	
	/**
	 * [tMap_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	
			cLabel="  Mapping<br>   <b>tMap_2</b>";
		

 



/**
 * [tMap_2 process_data_begin ] stop
 */
// Start of branch "insertCategorie"
if(insertCategorie != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_1</b>";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"insertCategorie","tMap_2","  Mapping<br>   <b>tMap_2</b>","tMap","tDBOutput_1","\"ODS_CATEGORIE\"<br>    <b>tDBOutput_1</b>","tPostgresqlOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("insertCategorie - " + (insertCategorie==null? "": insertCategorie.toLogString()));
    			}
    		



        whetherReject_tDBOutput_1 = false;
                    if(insertCategorie.CD_CATEGORIE == null) {
pstmt_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(1, insertCategorie.CD_CATEGORIE);
}

                    if(insertCategorie.LB_CATEGORIE == null) {
pstmt_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(2, insertCategorie.LB_CATEGORIE);
}

                    if(insertCategorie.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(3, insertCategorie.LB_NOM_FICHIER);
}

                    if(insertCategorie.DT_INSERTION != null) {
pstmt_tDBOutput_1.setTimestamp(4, new java.sql.Timestamp(insertCategorie.DT_INSERTION.getTime()));
} else {
pstmt_tDBOutput_1.setNull(4, java.sql.Types.TIMESTAMP);
}

                    pstmt_tDBOutput_1.setInt(5, insertCategorie.BL_LIGNE_ACTIVE);

                    if(insertCategorie.LB_JOB_NAME == null) {
pstmt_tDBOutput_1.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(6, insertCategorie.LB_JOB_NAME);
}

			
    		pstmt_tDBOutput_1.addBatch();
    		nb_line_tDBOutput_1++;
    		  
    		  
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Adding the record ")  + (nb_line_tDBOutput_1)  + (" to the ")  + ("INSERT")  + (" batch.") );
    		  batchSizeCounter_tDBOutput_1++;
    		  
    			if ((batchSize_tDBOutput_1 > 0) && (batchSize_tDBOutput_1 <= batchSizeCounter_tDBOutput_1)) {
                try {
						int countSum_tDBOutput_1 = 0;
						    
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
						for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
				    	rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
				    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
            	    	batchSizeCounter_tDBOutput_1 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
				    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
				    	String errormessage_tDBOutput_1;
						if (ne_tDBOutput_1 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
							errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
						}else{
							errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
						}
				    	
				    	int countSum_tDBOutput_1 = 0;
						for(int countEach_tDBOutput_1: e_tDBOutput_1.getUpdateCounts()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
						rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
						
				    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
            log.error("tDBOutput_1 - "  + (errormessage_tDBOutput_1) );
				    	System.err.println(errormessage_tDBOutput_1);
				    	
					}
    			}
    		

 


	tos_count_tDBOutput_1++;

/**
 * [tDBOutput_1 main ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_1</b>";
		

 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_1</b>";
		

 



/**
 * [tDBOutput_1 process_data_end ] stop
 */

} // End of branch "insertCategorie"




// Start of branch "updateBlCurrent"
if(updateBlCurrent != null) { 



	
	/**
	 * [tDBOutput_3 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_3</b>";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"updateBlCurrent","tMap_2","  Mapping<br>   <b>tMap_2</b>","tMap","tDBOutput_3","\"ODS_CATEGORIE\"<br>    <b>tDBOutput_3</b>","tPostgresqlOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("updateBlCurrent - " + (updateBlCurrent==null? "": updateBlCurrent.toLogString()));
    			}
    		



        whetherReject_tDBOutput_3 = false;
                    pstmt_tDBOutput_3.setInt(1, updateBlCurrent.BL_LIGNE_ACTIVE);

                    if(updateBlCurrent.CD_CATEGORIE == null) {
pstmt_tDBOutput_3.setNull(2 + count_tDBOutput_3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(2 + count_tDBOutput_3, updateBlCurrent.CD_CATEGORIE);
}


    		pstmt_tDBOutput_3.addBatch();
    		nb_line_tDBOutput_3++;
    		  
    		  
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Adding the record ")  + (nb_line_tDBOutput_3)  + (" to the ")  + ("UPDATE")  + (" batch.") );
    		  batchSizeCounter_tDBOutput_3++;
    		  
    			if ((batchSize_tDBOutput_3 > 0) && (batchSize_tDBOutput_3 <= batchSizeCounter_tDBOutput_3)) {
                try {
						int countSum_tDBOutput_3 = 0;
						    
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Executing the ")  + ("UPDATE")  + (" batch.") );
						for(int countEach_tDBOutput_3: pstmt_tDBOutput_3.executeBatch()) {
							countSum_tDBOutput_3 += (countEach_tDBOutput_3 < 0 ? 0 : countEach_tDBOutput_3);
						}
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("The ")  + ("UPDATE")  + (" batch execution has succeeded.") );
				    	rowsToCommitCount_tDBOutput_3 += countSum_tDBOutput_3;
				    	
				    		updatedCount_tDBOutput_3 += countSum_tDBOutput_3;
				    	
            	    	batchSizeCounter_tDBOutput_3 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_3){
globalMap.put("tDBOutput_3_ERROR_MESSAGE",e_tDBOutput_3.getMessage());
				    	java.sql.SQLException ne_tDBOutput_3 = e_tDBOutput_3.getNextException(),sqle_tDBOutput_3=null;
				    	String errormessage_tDBOutput_3;
						if (ne_tDBOutput_3 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_3 = new java.sql.SQLException(e_tDBOutput_3.getMessage() + "\ncaused by: " + ne_tDBOutput_3.getMessage(), ne_tDBOutput_3.getSQLState(), ne_tDBOutput_3.getErrorCode(), ne_tDBOutput_3);
							errormessage_tDBOutput_3 = sqle_tDBOutput_3.getMessage();
						}else{
							errormessage_tDBOutput_3 = e_tDBOutput_3.getMessage();
						}
				    	
				    	int countSum_tDBOutput_3 = 0;
						for(int countEach_tDBOutput_3: e_tDBOutput_3.getUpdateCounts()) {
							countSum_tDBOutput_3 += (countEach_tDBOutput_3 < 0 ? 0 : countEach_tDBOutput_3);
						}
						rowsToCommitCount_tDBOutput_3 += countSum_tDBOutput_3;
						
				    		updatedCount_tDBOutput_3 += countSum_tDBOutput_3;
				    	
            log.error("tDBOutput_3 - "  + (errormessage_tDBOutput_3) );
				    	System.err.println(errormessage_tDBOutput_3);
				    	
					}
    			}
    		

 


	tos_count_tDBOutput_3++;

/**
 * [tDBOutput_3 main ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_3</b>";
		

 



/**
 * [tDBOutput_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_3</b>";
		

 



/**
 * [tDBOutput_3 process_data_end ] stop
 */

} // End of branch "updateBlCurrent"




// Start of branch "insertNewValueCategorie"
if(insertNewValueCategorie != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_2</b>";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"insertNewValueCategorie","tMap_2","  Mapping<br>   <b>tMap_2</b>","tMap","tDBOutput_2","\"ODS_CATEGORIE\"<br>    <b>tDBOutput_2</b>","tPostgresqlOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("insertNewValueCategorie - " + (insertNewValueCategorie==null? "": insertNewValueCategorie.toLogString()));
    			}
    		



        whetherReject_tDBOutput_2 = false;
                    if(insertNewValueCategorie.CD_CATEGORIE == null) {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(1, insertNewValueCategorie.CD_CATEGORIE);
}

                    if(insertNewValueCategorie.LB_CATEGORIE == null) {
pstmt_tDBOutput_2.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(2, insertNewValueCategorie.LB_CATEGORIE);
}

                    if(insertNewValueCategorie.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_2.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(3, insertNewValueCategorie.LB_NOM_FICHIER);
}

                    if(insertNewValueCategorie.DT_INSERTION != null) {
pstmt_tDBOutput_2.setTimestamp(4, new java.sql.Timestamp(insertNewValueCategorie.DT_INSERTION.getTime()));
} else {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.TIMESTAMP);
}

                    pstmt_tDBOutput_2.setInt(5, insertNewValueCategorie.BL_LIGNE_ACTIVE);

                    if(insertNewValueCategorie.LB_JOB_NAME == null) {
pstmt_tDBOutput_2.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(6, insertNewValueCategorie.LB_JOB_NAME);
}

			
    		pstmt_tDBOutput_2.addBatch();
    		nb_line_tDBOutput_2++;
    		  
    		  
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Adding the record ")  + (nb_line_tDBOutput_2)  + (" to the ")  + ("INSERT")  + (" batch.") );
    		  batchSizeCounter_tDBOutput_2++;
    		  
    			if ((batchSize_tDBOutput_2 > 0) && (batchSize_tDBOutput_2 <= batchSizeCounter_tDBOutput_2)) {
                try {
						int countSum_tDBOutput_2 = 0;
						    
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
						for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
							countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
						}
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
				    	rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
				    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
            	    	batchSizeCounter_tDBOutput_2 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_2){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e_tDBOutput_2.getMessage());
				    	java.sql.SQLException ne_tDBOutput_2 = e_tDBOutput_2.getNextException(),sqle_tDBOutput_2=null;
				    	String errormessage_tDBOutput_2;
						if (ne_tDBOutput_2 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_2 = new java.sql.SQLException(e_tDBOutput_2.getMessage() + "\ncaused by: " + ne_tDBOutput_2.getMessage(), ne_tDBOutput_2.getSQLState(), ne_tDBOutput_2.getErrorCode(), ne_tDBOutput_2);
							errormessage_tDBOutput_2 = sqle_tDBOutput_2.getMessage();
						}else{
							errormessage_tDBOutput_2 = e_tDBOutput_2.getMessage();
						}
				    	
				    	int countSum_tDBOutput_2 = 0;
						for(int countEach_tDBOutput_2: e_tDBOutput_2.getUpdateCounts()) {
							countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
						}
						rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
						
				    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
            log.error("tDBOutput_2 - "  + (errormessage_tDBOutput_2) );
				    	System.err.println(errormessage_tDBOutput_2);
				    	
					}
    			}
    		

 


	tos_count_tDBOutput_2++;

/**
 * [tDBOutput_2 main ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_2</b>";
		

 



/**
 * [tDBOutput_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_2</b>";
		

 



/**
 * [tDBOutput_2 process_data_end ] stop
 */

} // End of branch "insertNewValueCategorie"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	
			cLabel="  Mapping<br>   <b>tMap_2</b>";
		

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "row3"




// Start of branch "row6"
if(row6 != null) { 



	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	
			cLabel=" Ajout Valeurs en double<br>              <b>tMap_4</b>";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row6","tUniqRow_1","           Suppression des doublons<br>                    <b>tUniqRow_1</b>","tUniqRow","tMap_4"," Ajout Valeurs en double<br>              <b>tMap_4</b>","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row6 - " + (row6==null? "": row6.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_4 = false;
		boolean mainRowRejected_tMap_4 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;// ###############################
        // ###############################
        // # Output tables

insertDuplicate = null;


// # Output table : 'insertDuplicate'
count_insertDuplicate_tMap_4++;

insertDuplicate_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
insertDuplicate_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
insertDuplicate_tmp.NUM_LIGNE_REJET = row6.NUM_LIGNE ;
insertDuplicate_tmp.LB_LIGNE_REJET = row6.CD_CATEGORIE+"|"+row6.LB_CATEGORIE ;
insertDuplicate_tmp.LB_MESSAGE_REJET = "Données en double";
insertDuplicate_tmp.LB_NOM_FLUX = ((String)globalMap.get("nom_flux"));
insertDuplicate_tmp.DT_REJET = TalendDate.getCurrentDate() ;
insertDuplicate_tmp.LB_JOB_NAME = jobName;
insertDuplicate = insertDuplicate_tmp;
log.debug("tMap_4 - Outputting the record " + count_insertDuplicate_tMap_4 + " of the output table 'insertDuplicate'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_4 = false;










 


	tos_count_tMap_4++;

/**
 * [tMap_4 main ] stop
 */
	
	/**
	 * [tMap_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	
			cLabel=" Ajout Valeurs en double<br>              <b>tMap_4</b>";
		

 



/**
 * [tMap_4 process_data_begin ] stop
 */
// Start of branch "insertDuplicate"
if(insertDuplicate != null) { 



	
	/**
	 * [tDBOutput_5 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";
	
	
			cLabel=" \"ODS_REJET\"<br><b>tDBOutput_5</b>";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"insertDuplicate","tMap_4"," Ajout Valeurs en double<br>              <b>tMap_4</b>","tMap","tDBOutput_5"," \"ODS_REJET\"<br><b>tDBOutput_5</b>","tPostgresqlOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("insertDuplicate - " + (insertDuplicate==null? "": insertDuplicate.toLogString()));
    			}
    		



        whetherReject_tDBOutput_5 = false;
                    if(insertDuplicate.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_5.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(1, insertDuplicate.LB_CHEMIN_FICHIER);
}

                    if(insertDuplicate.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_5.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(2, insertDuplicate.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_5.setInt(3, insertDuplicate.NUM_LIGNE_REJET);

                    if(insertDuplicate.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_5.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(4, insertDuplicate.LB_LIGNE_REJET);
}

            int checkCount_tDBOutput_5 = -1;
            try (java.sql.ResultSet rs_tDBOutput_5 = pstmt_tDBOutput_5.executeQuery()) {
                while(rs_tDBOutput_5.next()) {
                    checkCount_tDBOutput_5 = rs_tDBOutput_5.getInt(1);
                }
            }
            if(checkCount_tDBOutput_5 > 0) {
                        if(insertDuplicate.LB_MESSAGE_REJET == null) {
pstmtUpdate_tDBOutput_5.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(1, insertDuplicate.LB_MESSAGE_REJET);
}

                        if(insertDuplicate.LB_NOM_FLUX == null) {
pstmtUpdate_tDBOutput_5.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(2, insertDuplicate.LB_NOM_FLUX);
}

                        if(insertDuplicate.DT_REJET != null) {
pstmtUpdate_tDBOutput_5.setTimestamp(3, new java.sql.Timestamp(insertDuplicate.DT_REJET.getTime()));
} else {
pstmtUpdate_tDBOutput_5.setNull(3, java.sql.Types.TIMESTAMP);
}

                        if(insertDuplicate.LB_JOB_NAME == null) {
pstmtUpdate_tDBOutput_5.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(4, insertDuplicate.LB_JOB_NAME);
}

                        if(insertDuplicate.LB_CHEMIN_FICHIER == null) {
pstmtUpdate_tDBOutput_5.setNull(5 + count_tDBOutput_5, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(5 + count_tDBOutput_5, insertDuplicate.LB_CHEMIN_FICHIER);
}

                        if(insertDuplicate.LB_NOM_FICHIER == null) {
pstmtUpdate_tDBOutput_5.setNull(6 + count_tDBOutput_5, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(6 + count_tDBOutput_5, insertDuplicate.LB_NOM_FICHIER);
}

                        pstmtUpdate_tDBOutput_5.setInt(7 + count_tDBOutput_5, insertDuplicate.NUM_LIGNE_REJET);

                        if(insertDuplicate.LB_LIGNE_REJET == null) {
pstmtUpdate_tDBOutput_5.setNull(8 + count_tDBOutput_5, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(8 + count_tDBOutput_5, insertDuplicate.LB_LIGNE_REJET);
}

                try {
					
                    int processedCount_tDBOutput_5 = pstmtUpdate_tDBOutput_5.executeUpdate();
                    updatedCount_tDBOutput_5 += processedCount_tDBOutput_5;
                    rowsToCommitCount_tDBOutput_5 += processedCount_tDBOutput_5;
                    nb_line_tDBOutput_5++;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Updating")  + (" the record ")  + (nb_line_tDBOutput_5)  + (".") );
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_5 = true;
                        nb_line_tDBOutput_5++;
            log.error("tDBOutput_5 - "  + (e.getMessage()) );
                            System.err.print(e.getMessage());
                }
            } else {
                        if(insertDuplicate.LB_CHEMIN_FICHIER == null) {
pstmtInsert_tDBOutput_5.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(1, insertDuplicate.LB_CHEMIN_FICHIER);
}

                        if(insertDuplicate.LB_NOM_FICHIER == null) {
pstmtInsert_tDBOutput_5.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(2, insertDuplicate.LB_NOM_FICHIER);
}

                        pstmtInsert_tDBOutput_5.setInt(3, insertDuplicate.NUM_LIGNE_REJET);

                        if(insertDuplicate.LB_LIGNE_REJET == null) {
pstmtInsert_tDBOutput_5.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(4, insertDuplicate.LB_LIGNE_REJET);
}

                        if(insertDuplicate.LB_MESSAGE_REJET == null) {
pstmtInsert_tDBOutput_5.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(5, insertDuplicate.LB_MESSAGE_REJET);
}

                        if(insertDuplicate.LB_NOM_FLUX == null) {
pstmtInsert_tDBOutput_5.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(6, insertDuplicate.LB_NOM_FLUX);
}

                        if(insertDuplicate.DT_REJET != null) {
pstmtInsert_tDBOutput_5.setTimestamp(7, new java.sql.Timestamp(insertDuplicate.DT_REJET.getTime()));
} else {
pstmtInsert_tDBOutput_5.setNull(7, java.sql.Types.TIMESTAMP);
}

                        if(insertDuplicate.LB_JOB_NAME == null) {
pstmtInsert_tDBOutput_5.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(8, insertDuplicate.LB_JOB_NAME);
}

                try {
					
                    int processedCount_tDBOutput_5 = pstmtInsert_tDBOutput_5.executeUpdate();
                    insertedCount_tDBOutput_5 += processedCount_tDBOutput_5;
                    rowsToCommitCount_tDBOutput_5 += processedCount_tDBOutput_5;
                    nb_line_tDBOutput_5++;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Inserting")  + (" the record ")  + (nb_line_tDBOutput_5)  + (".") );
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_5 = true;
                        nb_line_tDBOutput_5++;
            log.error("tDBOutput_5 - "  + (e.getMessage()) );
                            System.err.print(e.getMessage());
                }
            }

 


	tos_count_tDBOutput_5++;

/**
 * [tDBOutput_5 main ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";
	
	
			cLabel=" \"ODS_REJET\"<br><b>tDBOutput_5</b>";
		

 



/**
 * [tDBOutput_5 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";
	
	
			cLabel=" \"ODS_REJET\"<br><b>tDBOutput_5</b>";
		

 



/**
 * [tDBOutput_5 process_data_end ] stop
 */

} // End of branch "insertDuplicate"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	
			cLabel=" Ajout Valeurs en double<br>              <b>tMap_4</b>";
		

 



/**
 * [tMap_4 process_data_end ] stop
 */

} // End of branch "row6"




	
	/**
	 * [tUniqRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";
	
	
			cLabel="           Suppression des doublons<br>                    <b>tUniqRow_1</b>";
		

 



/**
 * [tUniqRow_1 process_data_end ] stop
 */

} // End of branch "row2"




// Start of branch "row5"
if(row5 != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	
			cLabel="Ajout valeurs nulles<br>          <b>tMap_3</b>";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row5","tFilterRow_2","Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>","tFilterRow","tMap_3","Ajout valeurs nulles<br>          <b>tMap_3</b>","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row5 - " + (row5==null? "": row5.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_3 = false;
		boolean mainRowRejected_tMap_3 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

insertReject = null;


// # Output table : 'insertReject'
count_insertReject_tMap_3++;

insertReject_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
insertReject_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE")) ;
insertReject_tmp.NUM_LIGNE_REJET = row5.NUM_LIGNE ;
insertReject_tmp.LB_LIGNE_REJET = row5.CD_CATEGORIE+"|"+row5.LB_CATEGORIE ;
insertReject_tmp.LB_MESSAGE_REJET = "Valeurs nulles pour certaines colonnes";
insertReject_tmp.LB_NOM_FLUX = ((String)globalMap.get("nom_flux"));
insertReject_tmp.DT_REJET = TalendDate.getCurrentDate() ;
insertReject_tmp.LB_JOB_NAME = jobName;
insertReject = insertReject_tmp;
log.debug("tMap_3 - Outputting the record " + count_insertReject_tMap_3 + " of the output table 'insertReject'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_3 = false;










 


	tos_count_tMap_3++;

/**
 * [tMap_3 main ] stop
 */
	
	/**
	 * [tMap_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	
			cLabel="Ajout valeurs nulles<br>          <b>tMap_3</b>";
		

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "insertReject"
if(insertReject != null) { 



	
	/**
	 * [tDBOutput_4 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	
			cLabel="\"ODS_REJET\"<br><b>tDBOutput_4</b>";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"insertReject","tMap_3","Ajout valeurs nulles<br>          <b>tMap_3</b>","tMap","tDBOutput_4","\"ODS_REJET\"<br><b>tDBOutput_4</b>","tPostgresqlOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("insertReject - " + (insertReject==null? "": insertReject.toLogString()));
    			}
    		



        whetherReject_tDBOutput_4 = false;
                    if(insertReject.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(1, insertReject.LB_CHEMIN_FICHIER);
}

                    if(insertReject.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(2, insertReject.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_4.setInt(3, insertReject.NUM_LIGNE_REJET);

                    if(insertReject.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(4, insertReject.LB_LIGNE_REJET);
}

            int checkCount_tDBOutput_4 = -1;
            try (java.sql.ResultSet rs_tDBOutput_4 = pstmt_tDBOutput_4.executeQuery()) {
                while(rs_tDBOutput_4.next()) {
                    checkCount_tDBOutput_4 = rs_tDBOutput_4.getInt(1);
                }
            }
            if(checkCount_tDBOutput_4 > 0) {
                        if(insertReject.LB_MESSAGE_REJET == null) {
pstmtUpdate_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(1, insertReject.LB_MESSAGE_REJET);
}

                        if(insertReject.LB_NOM_FLUX == null) {
pstmtUpdate_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(2, insertReject.LB_NOM_FLUX);
}

                        if(insertReject.DT_REJET != null) {
pstmtUpdate_tDBOutput_4.setTimestamp(3, new java.sql.Timestamp(insertReject.DT_REJET.getTime()));
} else {
pstmtUpdate_tDBOutput_4.setNull(3, java.sql.Types.TIMESTAMP);
}

                        if(insertReject.LB_JOB_NAME == null) {
pstmtUpdate_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(4, insertReject.LB_JOB_NAME);
}

                        if(insertReject.LB_CHEMIN_FICHIER == null) {
pstmtUpdate_tDBOutput_4.setNull(5 + count_tDBOutput_4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(5 + count_tDBOutput_4, insertReject.LB_CHEMIN_FICHIER);
}

                        if(insertReject.LB_NOM_FICHIER == null) {
pstmtUpdate_tDBOutput_4.setNull(6 + count_tDBOutput_4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(6 + count_tDBOutput_4, insertReject.LB_NOM_FICHIER);
}

                        pstmtUpdate_tDBOutput_4.setInt(7 + count_tDBOutput_4, insertReject.NUM_LIGNE_REJET);

                        if(insertReject.LB_LIGNE_REJET == null) {
pstmtUpdate_tDBOutput_4.setNull(8 + count_tDBOutput_4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(8 + count_tDBOutput_4, insertReject.LB_LIGNE_REJET);
}

                try {
					
                    int processedCount_tDBOutput_4 = pstmtUpdate_tDBOutput_4.executeUpdate();
                    updatedCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    rowsToCommitCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    nb_line_tDBOutput_4++;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Updating")  + (" the record ")  + (nb_line_tDBOutput_4)  + (".") );
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_4 = true;
                        nb_line_tDBOutput_4++;
            log.error("tDBOutput_4 - "  + (e.getMessage()) );
                            System.err.print(e.getMessage());
                }
            } else {
                        if(insertReject.LB_CHEMIN_FICHIER == null) {
pstmtInsert_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(1, insertReject.LB_CHEMIN_FICHIER);
}

                        if(insertReject.LB_NOM_FICHIER == null) {
pstmtInsert_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(2, insertReject.LB_NOM_FICHIER);
}

                        pstmtInsert_tDBOutput_4.setInt(3, insertReject.NUM_LIGNE_REJET);

                        if(insertReject.LB_LIGNE_REJET == null) {
pstmtInsert_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(4, insertReject.LB_LIGNE_REJET);
}

                        if(insertReject.LB_MESSAGE_REJET == null) {
pstmtInsert_tDBOutput_4.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(5, insertReject.LB_MESSAGE_REJET);
}

                        if(insertReject.LB_NOM_FLUX == null) {
pstmtInsert_tDBOutput_4.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(6, insertReject.LB_NOM_FLUX);
}

                        if(insertReject.DT_REJET != null) {
pstmtInsert_tDBOutput_4.setTimestamp(7, new java.sql.Timestamp(insertReject.DT_REJET.getTime()));
} else {
pstmtInsert_tDBOutput_4.setNull(7, java.sql.Types.TIMESTAMP);
}

                        if(insertReject.LB_JOB_NAME == null) {
pstmtInsert_tDBOutput_4.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(8, insertReject.LB_JOB_NAME);
}

                try {
					
                    int processedCount_tDBOutput_4 = pstmtInsert_tDBOutput_4.executeUpdate();
                    insertedCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    rowsToCommitCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    nb_line_tDBOutput_4++;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Inserting")  + (" the record ")  + (nb_line_tDBOutput_4)  + (".") );
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_4 = true;
                        nb_line_tDBOutput_4++;
            log.error("tDBOutput_4 - "  + (e.getMessage()) );
                            System.err.print(e.getMessage());
                }
            }

 


	tos_count_tDBOutput_4++;

/**
 * [tDBOutput_4 main ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	
			cLabel="\"ODS_REJET\"<br><b>tDBOutput_4</b>";
		

 



/**
 * [tDBOutput_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	
			cLabel="\"ODS_REJET\"<br><b>tDBOutput_4</b>";
		

 



/**
 * [tDBOutput_4 process_data_end ] stop
 */

} // End of branch "insertReject"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	
			cLabel="Ajout valeurs nulles<br>          <b>tMap_3</b>";
		

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "row5"




	
	/**
	 * [tFilterRow_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";
	
	
			cLabel="Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>";
		

 



/**
 * [tFilterRow_2 process_data_end ] stop
 */

} // End of branch "Categorie"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
			cLabel="Ajout N\u00B0Ligne<br>      <b>tMap_1</b>";
		

 



/**
 * [tMap_1 process_data_end ] stop
 */

} // End of branch "row1"




	
	/**
	 * [tFileInputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";
	
	
			cLabel="         CATEGORIE<br>  <b>tFileInputDelimited_1</b>";
		

 



/**
 * [tFileInputDelimited_1 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";
	
	
			cLabel="         CATEGORIE<br>  <b>tFileInputDelimited_1</b>";
		



            }
            }finally{
                if(!((Object)(((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"))) instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_1!=null){
                		fid_tFileInputDelimited_1.close();
                	}
                }
                if(fid_tFileInputDelimited_1!=null){
                	globalMap.put("tFileInputDelimited_1_NB_LINE", fid_tFileInputDelimited_1.getRowNumber());
					
						log.info("tFileInputDelimited_1 - Retrieved records count: "+ fid_tFileInputDelimited_1.getRowNumber() + ".");
					
                }
			}
			  

 
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + ("Done.") );

ok_Hash.put("tFileInputDelimited_1", true);
end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());




/**
 * [tFileInputDelimited_1 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
			cLabel="Ajout N\u00B0Ligne<br>      <b>tMap_1</b>";
		


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'Categorie': " + count_Categorie_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tFileInputDelimited_1","         CATEGORIE<br>  <b>tFileInputDelimited_1</b>","tFileInputDelimited","tMap_1","Ajout N\u00B0Ligne<br>      <b>tMap_1</b>","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Done.") );

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tFilterRow_2 end ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";
	
	
			cLabel="Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>";
		
    globalMap.put("tFilterRow_2_NB_LINE", nb_line_tFilterRow_2);
    globalMap.put("tFilterRow_2_NB_LINE_OK", nb_line_ok_tFilterRow_2);
    globalMap.put("tFilterRow_2_NB_LINE_REJECT", nb_line_reject_tFilterRow_2);
    
    	log.info("tFilterRow_2 - Processed records count:" + nb_line_tFilterRow_2 + ". Matched records count:" + nb_line_ok_tFilterRow_2 + ". Rejected records count:" + nb_line_reject_tFilterRow_2 + ".");

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Categorie",2,0,
			 			"tMap_1","Ajout N\u00B0Ligne<br>      <b>tMap_1</b>","tMap","tFilterRow_2","Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>","tFilterRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFilterRow_2 - "  + ("Done.") );

ok_Hash.put("tFilterRow_2", true);
end_Hash.put("tFilterRow_2", System.currentTimeMillis());




/**
 * [tFilterRow_2 end ] stop
 */

	
	/**
	 * [tUniqRow_1 end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";
	
	
			cLabel="           Suppression des doublons<br>                    <b>tUniqRow_1</b>";
		

globalMap.put("tUniqRow_1_NB_UNIQUES",nb_uniques_tUniqRow_1);
globalMap.put("tUniqRow_1_NB_DUPLICATES",nb_duplicates_tUniqRow_1);
	log.info("tUniqRow_1 - Unique records count: " + (nb_uniques_tUniqRow_1)+" .");
	log.info("tUniqRow_1 - Duplicate records count: " + (nb_duplicates_tUniqRow_1)+" .");

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row2",2,0,
			 			"tFilterRow_2","Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>","tFilterRow","tUniqRow_1","           Suppression des doublons<br>                    <b>tUniqRow_1</b>","tUniqRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tUniqRow_1 - "  + ("Done.") );

ok_Hash.put("tUniqRow_1", true);
end_Hash.put("tUniqRow_1", System.currentTimeMillis());




/**
 * [tUniqRow_1 end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	
			cLabel="  Mapping<br>   <b>tMap_2</b>";
		


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row4 != null) {
						tHash_Lookup_row4.endGet();
					}
					globalMap.remove( "tHash_Lookup_row4" );

					
					
				
// ###############################      
				log.debug("tMap_2 - Written records count in the table 'insertCategorie': " + count_insertCategorie_tMap_2 + ".");
				log.debug("tMap_2 - Written records count in the table 'updateBlCurrent': " + count_updateBlCurrent_tMap_2 + ".");
				log.debug("tMap_2 - Written records count in the table 'insertNewValueCategorie': " + count_insertNewValueCategorie_tMap_2 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row3",2,0,
			 			"tUniqRow_1","           Suppression des doublons<br>                    <b>tUniqRow_1</b>","tUniqRow","tMap_2","  Mapping<br>   <b>tMap_2</b>","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + ("Done.") );

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_1</b>";
		



	    try {
				int countSum_tDBOutput_1 = 0;
				if (pstmt_tDBOutput_1 != null && batchSizeCounter_tDBOutput_1 > 0) {
						
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
					for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
						countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
					}
					rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
						
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
				}
		    	
		    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
	    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
	    	String errormessage_tDBOutput_1;
			if (ne_tDBOutput_1 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
				errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
			}else{
				errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
			}
	    	
	    	int countSum_tDBOutput_1 = 0;
			for(int countEach_tDBOutput_1: e_tDBOutput_1.getUpdateCounts()) {
				countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
			}
			rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
			
	    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
	    	
            log.error("tDBOutput_1 - "  + (errormessage_tDBOutput_1) );
	    	System.err.println(errormessage_tDBOutput_1);
	    	
		}
	    
        if(pstmt_tDBOutput_1 != null) {
        		
            pstmt_tDBOutput_1.close();
            resourceMap.remove("pstmt_tDBOutput_1");
        }
    resourceMap.put("statementClosed_tDBOutput_1", true);

	nb_line_deleted_tDBOutput_1=nb_line_deleted_tDBOutput_1+ deletedCount_tDBOutput_1;
	nb_line_update_tDBOutput_1=nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
	nb_line_inserted_tDBOutput_1=nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
	nb_line_rejected_tDBOutput_1=nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;
	
        globalMap.put("tDBOutput_1_NB_LINE",nb_line_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_UPDATED",nb_line_update_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_DELETED",nb_line_deleted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);
    

	


			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"insertCategorie",2,0,
			 			"tMap_2","  Mapping<br>   <b>tMap_2</b>","tMap","tDBOutput_1","\"ODS_CATEGORIE\"<br>    <b>tDBOutput_1</b>","tPostgresqlOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Done.") );

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */




	
	/**
	 * [tDBOutput_3 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_3</b>";
		



	    try {
				int countSum_tDBOutput_3 = 0;
				if (pstmt_tDBOutput_3 != null && batchSizeCounter_tDBOutput_3 > 0) {
						
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Executing the ")  + ("UPDATE")  + (" batch.") );
					for(int countEach_tDBOutput_3: pstmt_tDBOutput_3.executeBatch()) {
						countSum_tDBOutput_3 += (countEach_tDBOutput_3 < 0 ? 0 : countEach_tDBOutput_3);
					}
					rowsToCommitCount_tDBOutput_3 += countSum_tDBOutput_3;
						
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("The ")  + ("UPDATE")  + (" batch execution has succeeded.") );
				}
		    	
		    		updatedCount_tDBOutput_3 += countSum_tDBOutput_3;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_3){
globalMap.put("tDBOutput_3_ERROR_MESSAGE",e_tDBOutput_3.getMessage());
	    	java.sql.SQLException ne_tDBOutput_3 = e_tDBOutput_3.getNextException(),sqle_tDBOutput_3=null;
	    	String errormessage_tDBOutput_3;
			if (ne_tDBOutput_3 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_3 = new java.sql.SQLException(e_tDBOutput_3.getMessage() + "\ncaused by: " + ne_tDBOutput_3.getMessage(), ne_tDBOutput_3.getSQLState(), ne_tDBOutput_3.getErrorCode(), ne_tDBOutput_3);
				errormessage_tDBOutput_3 = sqle_tDBOutput_3.getMessage();
			}else{
				errormessage_tDBOutput_3 = e_tDBOutput_3.getMessage();
			}
	    	
	    	int countSum_tDBOutput_3 = 0;
			for(int countEach_tDBOutput_3: e_tDBOutput_3.getUpdateCounts()) {
				countSum_tDBOutput_3 += (countEach_tDBOutput_3 < 0 ? 0 : countEach_tDBOutput_3);
			}
			rowsToCommitCount_tDBOutput_3 += countSum_tDBOutput_3;
			
	    		updatedCount_tDBOutput_3 += countSum_tDBOutput_3;
	    	
            log.error("tDBOutput_3 - "  + (errormessage_tDBOutput_3) );
	    	System.err.println(errormessage_tDBOutput_3);
	    	
		}
	    
        if(pstmt_tDBOutput_3 != null) {
        		
            pstmt_tDBOutput_3.close();
            resourceMap.remove("pstmt_tDBOutput_3");
        }
    resourceMap.put("statementClosed_tDBOutput_3", true);

	nb_line_deleted_tDBOutput_3=nb_line_deleted_tDBOutput_3+ deletedCount_tDBOutput_3;
	nb_line_update_tDBOutput_3=nb_line_update_tDBOutput_3 + updatedCount_tDBOutput_3;
	nb_line_inserted_tDBOutput_3=nb_line_inserted_tDBOutput_3 + insertedCount_tDBOutput_3;
	nb_line_rejected_tDBOutput_3=nb_line_rejected_tDBOutput_3 + rejectedCount_tDBOutput_3;
	
        globalMap.put("tDBOutput_3_NB_LINE",nb_line_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_UPDATED",nb_line_update_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_DELETED",nb_line_deleted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_3);
    

	


			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"updateBlCurrent",2,0,
			 			"tMap_2","  Mapping<br>   <b>tMap_2</b>","tMap","tDBOutput_3","\"ODS_CATEGORIE\"<br>    <b>tDBOutput_3</b>","tPostgresqlOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Done.") );

ok_Hash.put("tDBOutput_3", true);
end_Hash.put("tDBOutput_3", System.currentTimeMillis());




/**
 * [tDBOutput_3 end ] stop
 */




	
	/**
	 * [tDBOutput_2 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_2</b>";
		



	    try {
				int countSum_tDBOutput_2 = 0;
				if (pstmt_tDBOutput_2 != null && batchSizeCounter_tDBOutput_2 > 0) {
						
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
					for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
						countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
					}
					rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
						
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
				}
		    	
		    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_2){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e_tDBOutput_2.getMessage());
	    	java.sql.SQLException ne_tDBOutput_2 = e_tDBOutput_2.getNextException(),sqle_tDBOutput_2=null;
	    	String errormessage_tDBOutput_2;
			if (ne_tDBOutput_2 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_2 = new java.sql.SQLException(e_tDBOutput_2.getMessage() + "\ncaused by: " + ne_tDBOutput_2.getMessage(), ne_tDBOutput_2.getSQLState(), ne_tDBOutput_2.getErrorCode(), ne_tDBOutput_2);
				errormessage_tDBOutput_2 = sqle_tDBOutput_2.getMessage();
			}else{
				errormessage_tDBOutput_2 = e_tDBOutput_2.getMessage();
			}
	    	
	    	int countSum_tDBOutput_2 = 0;
			for(int countEach_tDBOutput_2: e_tDBOutput_2.getUpdateCounts()) {
				countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
			}
			rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
			
	    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
	    	
            log.error("tDBOutput_2 - "  + (errormessage_tDBOutput_2) );
	    	System.err.println(errormessage_tDBOutput_2);
	    	
		}
	    
        if(pstmt_tDBOutput_2 != null) {
        		
            pstmt_tDBOutput_2.close();
            resourceMap.remove("pstmt_tDBOutput_2");
        }
    resourceMap.put("statementClosed_tDBOutput_2", true);

	nb_line_deleted_tDBOutput_2=nb_line_deleted_tDBOutput_2+ deletedCount_tDBOutput_2;
	nb_line_update_tDBOutput_2=nb_line_update_tDBOutput_2 + updatedCount_tDBOutput_2;
	nb_line_inserted_tDBOutput_2=nb_line_inserted_tDBOutput_2 + insertedCount_tDBOutput_2;
	nb_line_rejected_tDBOutput_2=nb_line_rejected_tDBOutput_2 + rejectedCount_tDBOutput_2;
	
        globalMap.put("tDBOutput_2_NB_LINE",nb_line_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_UPDATED",nb_line_update_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_DELETED",nb_line_deleted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_2);
    

	


			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"insertNewValueCategorie",2,0,
			 			"tMap_2","  Mapping<br>   <b>tMap_2</b>","tMap","tDBOutput_2","\"ODS_CATEGORIE\"<br>    <b>tDBOutput_2</b>","tPostgresqlOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Done.") );

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
 */







	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	
			cLabel=" Ajout Valeurs en double<br>              <b>tMap_4</b>";
		


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_4 - Written records count in the table 'insertDuplicate': " + count_insertDuplicate_tMap_4 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row6",2,0,
			 			"tUniqRow_1","           Suppression des doublons<br>                    <b>tUniqRow_1</b>","tUniqRow","tMap_4"," Ajout Valeurs en double<br>              <b>tMap_4</b>","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + ("Done.") );

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tDBOutput_5 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";
	
	
			cLabel=" \"ODS_REJET\"<br><b>tDBOutput_5</b>";
		



        if(pstmtUpdate_tDBOutput_5 != null){
            pstmtUpdate_tDBOutput_5.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_5");
        }
        if(pstmtInsert_tDBOutput_5 != null){
            pstmtInsert_tDBOutput_5.close();
            resourceMap.remove("pstmtInsert_tDBOutput_5");
        }
        if(pstmt_tDBOutput_5 != null) {
            pstmt_tDBOutput_5.close();
            resourceMap.remove("pstmt_tDBOutput_5");
        }
    resourceMap.put("statementClosed_tDBOutput_5", true);

	nb_line_deleted_tDBOutput_5=nb_line_deleted_tDBOutput_5+ deletedCount_tDBOutput_5;
	nb_line_update_tDBOutput_5=nb_line_update_tDBOutput_5 + updatedCount_tDBOutput_5;
	nb_line_inserted_tDBOutput_5=nb_line_inserted_tDBOutput_5 + insertedCount_tDBOutput_5;
	nb_line_rejected_tDBOutput_5=nb_line_rejected_tDBOutput_5 + rejectedCount_tDBOutput_5;
	
        globalMap.put("tDBOutput_5_NB_LINE",nb_line_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_UPDATED",nb_line_update_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_DELETED",nb_line_deleted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_5);
    

	


			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"insertDuplicate",2,0,
			 			"tMap_4"," Ajout Valeurs en double<br>              <b>tMap_4</b>","tMap","tDBOutput_5"," \"ODS_REJET\"<br><b>tDBOutput_5</b>","tPostgresqlOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Done.") );

ok_Hash.put("tDBOutput_5", true);
end_Hash.put("tDBOutput_5", System.currentTimeMillis());




/**
 * [tDBOutput_5 end ] stop
 */










	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	
			cLabel="Ajout valeurs nulles<br>          <b>tMap_3</b>";
		


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_3 - Written records count in the table 'insertReject': " + count_insertReject_tMap_3 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row5",2,0,
			 			"tFilterRow_2","Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>","tFilterRow","tMap_3","Ajout valeurs nulles<br>          <b>tMap_3</b>","tMap","reject")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + ("Done.") );

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tDBOutput_4 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	
			cLabel="\"ODS_REJET\"<br><b>tDBOutput_4</b>";
		



        if(pstmtUpdate_tDBOutput_4 != null){
            pstmtUpdate_tDBOutput_4.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_4");
        }
        if(pstmtInsert_tDBOutput_4 != null){
            pstmtInsert_tDBOutput_4.close();
            resourceMap.remove("pstmtInsert_tDBOutput_4");
        }
        if(pstmt_tDBOutput_4 != null) {
            pstmt_tDBOutput_4.close();
            resourceMap.remove("pstmt_tDBOutput_4");
        }
    resourceMap.put("statementClosed_tDBOutput_4", true);

	nb_line_deleted_tDBOutput_4=nb_line_deleted_tDBOutput_4+ deletedCount_tDBOutput_4;
	nb_line_update_tDBOutput_4=nb_line_update_tDBOutput_4 + updatedCount_tDBOutput_4;
	nb_line_inserted_tDBOutput_4=nb_line_inserted_tDBOutput_4 + insertedCount_tDBOutput_4;
	nb_line_rejected_tDBOutput_4=nb_line_rejected_tDBOutput_4 + rejectedCount_tDBOutput_4;
	
        globalMap.put("tDBOutput_4_NB_LINE",nb_line_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_UPDATED",nb_line_update_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_DELETED",nb_line_deleted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_4);
    

	


			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"insertReject",2,0,
			 			"tMap_3","Ajout valeurs nulles<br>          <b>tMap_3</b>","tMap","tDBOutput_4","\"ODS_REJET\"<br><b>tDBOutput_4</b>","tPostgresqlOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Done.") );

ok_Hash.put("tDBOutput_4", true);
end_Hash.put("tDBOutput_4", System.currentTimeMillis());




/**
 * [tDBOutput_4 end ] stop
 */












				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row4"); 
				     			
				try{
					
	
	/**
	 * [tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";
	
	
			cLabel="         CATEGORIE<br>  <b>tFileInputDelimited_1</b>";
		

 



/**
 * [tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
			cLabel="Ajout N\u00B0Ligne<br>      <b>tMap_1</b>";
		

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tFilterRow_2 finally ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";
	
	
			cLabel="Donn\u00E9es non nulles<br>      <b>tFilterRow_2</b>";
		

 



/**
 * [tFilterRow_2 finally ] stop
 */

	
	/**
	 * [tUniqRow_1 finally ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";
	
	
			cLabel="           Suppression des doublons<br>                    <b>tUniqRow_1</b>";
		

 



/**
 * [tUniqRow_1 finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	
			cLabel="  Mapping<br>   <b>tMap_2</b>";
		

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_1</b>";
		



    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
                }
    }
 



/**
 * [tDBOutput_1 finally ] stop
 */




	
	/**
	 * [tDBOutput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_3</b>";
		



    if (resourceMap.get("statementClosed_tDBOutput_3") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_3 = null;
                if ((pstmtToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_3")) != null) {
                    pstmtToClose_tDBOutput_3.close();
                }
    }
 



/**
 * [tDBOutput_3 finally ] stop
 */




	
	/**
	 * [tDBOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>    <b>tDBOutput_2</b>";
		



    if (resourceMap.get("statementClosed_tDBOutput_2") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_2 = null;
                if ((pstmtToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_2")) != null) {
                    pstmtToClose_tDBOutput_2.close();
                }
    }
 



/**
 * [tDBOutput_2 finally ] stop
 */







	
	/**
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	
			cLabel=" Ajout Valeurs en double<br>              <b>tMap_4</b>";
		

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tDBOutput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";
	
	
			cLabel=" \"ODS_REJET\"<br><b>tDBOutput_5</b>";
		



    if (resourceMap.get("statementClosed_tDBOutput_5") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_5 = null;
                if ((pstmtUpdateToClose_tDBOutput_5 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_5")) != null) {
                    pstmtUpdateToClose_tDBOutput_5.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_5 = null;
                if ((pstmtInsertToClose_tDBOutput_5 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_5")) != null) {
                    pstmtInsertToClose_tDBOutput_5.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_5 = null;
                if ((pstmtToClose_tDBOutput_5 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_5")) != null) {
                    pstmtToClose_tDBOutput_5.close();
                }
    }
 



/**
 * [tDBOutput_5 finally ] stop
 */










	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	
			cLabel="Ajout valeurs nulles<br>          <b>tMap_3</b>";
		

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tDBOutput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	
			cLabel="\"ODS_REJET\"<br><b>tDBOutput_4</b>";
		



    if (resourceMap.get("statementClosed_tDBOutput_4") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_4 = null;
                if ((pstmtUpdateToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_4")) != null) {
                    pstmtUpdateToClose_tDBOutput_4.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_4 = null;
                if ((pstmtInsertToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_4")) != null) {
                    pstmtInsertToClose_tDBOutput_4.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_4 = null;
                if ((pstmtToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_4")) != null) {
                    pstmtToClose_tDBOutput_4.close();
                }
    }
 



/**
 * [tDBOutput_4 finally ] stop
 */












				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 1);
	}
	

public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tDie_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_1", false);
		start_Hash.put("tDie_1", System.currentTimeMillis());
		
	
	currentComponent="tDie_1";
	
	
			cLabel="Arret du job si aucun fichier<br>                    <b>tDie_1</b>";
		
		int tos_count_tDie_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDie_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDie_1 = new StringBuilder();
                    log4jParamters_tDie_1.append("Parameters:");
                            log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"Le répertoire \"+TalendDate.getDate(\"YYYYMMDD\")+ \" ne contient pas de fichier Categorie. Veuillez déposer le fichier du jour et relancer l'intégration\" ");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("CODE" + " = " + "4");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("PRIORITY" + " = " + "5");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("EXIT_JVM" + " = " + "true");
                        log4jParamters_tDie_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + (log4jParamters_tDie_1) );
                    } 
                } 
            new BytesLimit65535_tDie_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDie_1", "Arret du job si aucun fichier<br>                    <b>tDie_1</b>", "tDie");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDie_1 begin ] stop
 */
	
	/**
	 * [tDie_1 main ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	
			cLabel="Arret du job si aucun fichier<br>                    <b>tDie_1</b>";
		

	try {
	globalMap.put("tDie_1_DIE_PRIORITY", 5);
	System.err.println("Le répertoire "+TalendDate.getDate("YYYYMMDD")+ " ne contient pas de fichier Categorie. Veuillez déposer le fichier du jour et relancer l'intégration" );
	
		log.error("tDie_1 - The die message: "+"Le répertoire "+TalendDate.getDate("YYYYMMDD")+ " ne contient pas de fichier Categorie. Veuillez déposer le fichier du jour et relancer l'intégration" );
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Le répertoire "+TalendDate.getDate("YYYYMMDD")+ " ne contient pas de fichier Categorie. Veuillez déposer le fichier du jour et relancer l'intégration" );
	globalMap.put("tDie_1_DIE_MESSAGES", "Le répertoire "+TalendDate.getDate("YYYYMMDD")+ " ne contient pas de fichier Categorie. Veuillez déposer le fichier du jour et relancer l'intégration" );
	
	} catch (Exception | Error e_tDie_1) {
	    globalMap.put("tDie_1_ERROR_MESSAGE",e_tDie_1.getMessage());
		logIgnoredError(String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1), e_tDie_1);
	}
	
	currentComponent = "tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_1_DIE_CODE", errorCode);        

    
	
		log.fatal("tDie_1 - Exiting the VM.");
	

	
		if(enableLogStash) {
			talendJobLog.addJobExceptionMessage(currentComponent, cLabel, "Le répertoire "+TalendDate.getDate("YYYYMMDD")+ " ne contient pas de fichier Categorie. Veuillez déposer le fichier du jour et relancer l'intégration" , null);
			talendJobLogProcess(globalMap);
		}
	
	
	System.exit(4);

 


	tos_count_tDie_1++;

/**
 * [tDie_1 main ] stop
 */
	
	/**
	 * [tDie_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	
			cLabel="Arret du job si aucun fichier<br>                    <b>tDie_1</b>";
		

 



/**
 * [tDie_1 process_data_begin ] stop
 */
	
	/**
	 * [tDie_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	
			cLabel="Arret du job si aucun fichier<br>                    <b>tDie_1</b>";
		

 



/**
 * [tDie_1 process_data_end ] stop
 */
	
	/**
	 * [tDie_1 end ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	
			cLabel="Arret du job si aucun fichier<br>                    <b>tDie_1</b>";
		

 
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + ("Done.") );

ok_Hash.put("tDie_1", true);
end_Hash.put("tDie_1", System.currentTimeMillis());




/**
 * [tDie_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_1 finally ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	
			cLabel="Arret du job si aucun fichier<br>                    <b>tDie_1</b>";
		

 



/**
 * [tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableComparableLookupRow<row4Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}

				public Boolean CD_CATEGORIEIsNullable(){
				    return false;
				}
				public Boolean CD_CATEGORIEIsKey(){
				    return true;
				}
				public Integer CD_CATEGORIELength(){
				    return 50;
				}
				public Integer CD_CATEGORIEPrecision(){
				    return 0;
				}
				public String CD_CATEGORIEDefault(){
				
					return null;
				
				}
				public String CD_CATEGORIEComment(){
				
				    return "";
				
				}
				public String CD_CATEGORIEPattern(){
				
					return "";
				
				}
				public String CD_CATEGORIEOriginalDbColumnName(){
				
					return "CD_CATEGORIE";
				
				}

				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}

				public Boolean LB_CATEGORIEIsNullable(){
				    return false;
				}
				public Boolean LB_CATEGORIEIsKey(){
				    return false;
				}
				public Integer LB_CATEGORIELength(){
				    return 100;
				}
				public Integer LB_CATEGORIEPrecision(){
				    return 0;
				}
				public String LB_CATEGORIEDefault(){
				
					return null;
				
				}
				public String LB_CATEGORIEComment(){
				
				    return "";
				
				}
				public String LB_CATEGORIEPattern(){
				
					return "";
				
				}
				public String LB_CATEGORIEOriginalDbColumnName(){
				
					return "LB_CATEGORIE";
				
				}

				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}

				public Boolean LB_NOM_FICHIERIsNullable(){
				    return false;
				}
				public Boolean LB_NOM_FICHIERIsKey(){
				    return false;
				}
				public Integer LB_NOM_FICHIERLength(){
				    return 100;
				}
				public Integer LB_NOM_FICHIERPrecision(){
				    return 0;
				}
				public String LB_NOM_FICHIERDefault(){
				
					return null;
				
				}
				public String LB_NOM_FICHIERComment(){
				
				    return "";
				
				}
				public String LB_NOM_FICHIERPattern(){
				
					return "";
				
				}
				public String LB_NOM_FICHIEROriginalDbColumnName(){
				
					return "LB_NOM_FICHIER";
				
				}

				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}

				public Boolean DT_INSERTIONIsNullable(){
				    return false;
				}
				public Boolean DT_INSERTIONIsKey(){
				    return false;
				}
				public Integer DT_INSERTIONLength(){
				    return 29;
				}
				public Integer DT_INSERTIONPrecision(){
				    return 6;
				}
				public String DT_INSERTIONDefault(){
				
					return null;
				
				}
				public String DT_INSERTIONComment(){
				
				    return "";
				
				}
				public String DT_INSERTIONPattern(){
				
					return "dd-MM-yyyy HH:mm:ss";
				
				}
				public String DT_INSERTIONOriginalDbColumnName(){
				
					return "DT_INSERTION";
				
				}

				
			    public int BL_LIGNE_ACTIVE;

				public int getBL_LIGNE_ACTIVE () {
					return this.BL_LIGNE_ACTIVE;
				}

				public Boolean BL_LIGNE_ACTIVEIsNullable(){
				    return false;
				}
				public Boolean BL_LIGNE_ACTIVEIsKey(){
				    return false;
				}
				public Integer BL_LIGNE_ACTIVELength(){
				    return 10;
				}
				public Integer BL_LIGNE_ACTIVEPrecision(){
				    return 0;
				}
				public String BL_LIGNE_ACTIVEDefault(){
				
					return null;
				
				}
				public String BL_LIGNE_ACTIVEComment(){
				
				    return "";
				
				}
				public String BL_LIGNE_ACTIVEPattern(){
				
					return "";
				
				}
				public String BL_LIGNE_ACTIVEOriginalDbColumnName(){
				
					return "BL_LIGNE_ACTIVE";
				
				}

				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}

				public Boolean LB_JOB_NAMEIsNullable(){
				    return false;
				}
				public Boolean LB_JOB_NAMEIsKey(){
				    return false;
				}
				public Integer LB_JOB_NAMELength(){
				    return 100;
				}
				public Integer LB_JOB_NAMEPrecision(){
				    return 0;
				}
				public String LB_JOB_NAMEDefault(){
				
					return null;
				
				}
				public String LB_JOB_NAMEComment(){
				
				    return "";
				
				}
				public String LB_JOB_NAMEPattern(){
				
					return "";
				
				}
				public String LB_JOB_NAMEOriginalDbColumnName(){
				
					return "LB_JOB_NAME";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CD_CATEGORIE == null) ? 0 : this.CD_CATEGORIE.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row4Struct other = (row4Struct) obj;
		
						if (this.CD_CATEGORIE == null) {
							if (other.CD_CATEGORIE != null)
								return false;
						
						} else if (!this.CD_CATEGORIE.equals(other.CD_CATEGORIE))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row4Struct other) {

		other.CD_CATEGORIE = this.CD_CATEGORIE;
	            other.LB_CATEGORIE = this.LB_CATEGORIE;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.BL_LIGNE_ACTIVE = this.BL_LIGNE_ACTIVE;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row4Struct other) {

		other.CD_CATEGORIE = this.CD_CATEGORIE;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jOdsCategorie, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jOdsCategorie) {

        	try {

        		int length = 0;
		
					this.CD_CATEGORIE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_CATEGORIE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.LB_CATEGORIE = readString(dis,ois);
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
			            this.BL_LIGNE_ACTIVE = dis.readInt();
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.LB_CATEGORIE = readString(dis,objectIn);
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
			            this.BL_LIGNE_ACTIVE = objectIn.readInt();
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.LB_CATEGORIE, dos, oos);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.LB_CATEGORIE, dos, objectOut);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
					objectOut.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CD_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CD_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_CATEGORIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_CATEGORIE);
            			}
            		
        			sb.append("|");
        		
        				if(LB_NOM_FICHIER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_NOM_FICHIER);
            			}
            		
        			sb.append("|");
        		
        				if(DT_INSERTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_INSERTION);
            			}
            		
        			sb.append("|");
        		
        				sb.append(BL_LIGNE_ACTIVE);
        			
        			sb.append("|");
        		
        				if(LB_JOB_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LB_JOB_NAME);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CD_CATEGORIE, other.CD_CATEGORIE);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tDBInput_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row4Struct row4 = new row4Struct();




	
	/**
	 * [tAdvancedHash_row4 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row4", false);
		start_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row4";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row4");
			
		int tos_count_tAdvancedHash_row4 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row4", "tAdvancedHash_row4", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row4
			   		// source node:tDBInput_1 - inputs:(after_tFileInputDelimited_1) outputs:(row4,row4) | target node:tAdvancedHash_row4 - inputs:(row4) outputs:()
			   		// linked node: tMap_2 - inputs:(row3,row4) outputs:(insertCategorie,updateBlCurrent,insertNewValueCategorie)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row4 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row4Struct>getLookup(matchingModeEnum_row4);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row4", tHash_Lookup_row4);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row4 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>     <b>tDBInput_1</b>";
		
		int tos_count_tDBInput_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_1 = new StringBuilder();
                    log4jParamters_tDBInput_1.append("Parameters:");
                            log4jParamters_tDBInput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"SELECT    \\\"\"+context.schema_ods+\"\\\".\\\"ODS_CATEGORIE\\\".\\\"CD_CATEGORIE\\\",    \\\"\"+context.schema_ods+\"\\\".\\\"ODS_CATEGORIE\\\".\\\"LB_CATEGORIE\\\",    \\\"\"+context.schema_ods+\"\\\".\\\"ODS_CATEGORIE\\\".\\\"LB_NOM_FICHIER\\\",    \\\"\"+context.schema_ods+\"\\\".\\\"ODS_CATEGORIE\\\".\\\"DT_INSERTION\\\",    \\\"\"+context.schema_ods+\"\\\".\\\"ODS_CATEGORIE\\\".\\\"BL_LIGNE_ACTIVE\\\",    \\\"\"+context.schema_ods+\"\\\".\\\"ODS_CATEGORIE\\\".\\\"LB_JOB_NAME\\\" FROM \\\"\"+context.schema_ods+\"\\\".\\\"ODS_CATEGORIE\\\"  WHERE \\\"BL_LIGNE_ACTIVE\\\"=1;  \"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("CD_CATEGORIE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LB_CATEGORIE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LB_NOM_FICHIER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DT_INSERTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BL_LIGNE_ACTIVE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LB_JOB_NAME")+"}]");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("UNIFIED_COMPONENTS" + " = " + "tPostgresqlInput");
                        log4jParamters_tDBInput_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + (log4jParamters_tDBInput_1) );
                    } 
                } 
            new BytesLimit65535_tDBInput_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_1", "\"ODS_CATEGORIE\"<br>     <b>tDBInput_1</b>", "tPostgresqlInput");
				talendJobLogProcess(globalMap);
			}
			
	
    
	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				conn_tDBInput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
				if(conn_tDBInput_1 != null) {
					if(conn_tDBInput_1.getMetaData() != null) {
						
							log.debug("tDBInput_1 - Uses an existing connection with username '" + conn_tDBInput_1.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_1.getMetaData().getURL() + ".");
						
					}
				}
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT \n  \""+context.schema_ods+"\".\"ODS_CATEGORIE\".\"CD_CATEGORIE\", \n  \""+context.schema_ods+"\".\"ODS_CATEGORIE\".\"LB_CATEGORIE\", \n  \""+context.schema_ods+"\".\"ODS_CATEGORIE\".\"LB_NOM_FICHIER\", \n  \""+context.schema_ods+"\".\"ODS_CATEGORIE\".\"DT_INSERTION\", \n  \""+context.schema_ods+"\".\"ODS_CATEGORIE\".\"BL_LIGNE_ACTIVE\", \n  \""+context.schema_ods+"\".\"ODS_CATEGORIE\".\"LB_JOB_NAME\"\nFROM \""+context.schema_ods+"\".\"ODS_CATEGORIE\"\nWHERE \"BL_LIGNE_ACTIVE\"=1;\n";
		    
	    		log.debug("tDBInput_1 - Executing the query: '" + dbquery_tDBInput_1 + "'.");
			

            	globalMap.put("tDBInput_1_QUERY",dbquery_tDBInput_1);
		    java.sql.ResultSet rs_tDBInput_1 = null;

		    try {
		    	rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
		    	int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

		    String tmpContent_tDBInput_1 = null;
		    
		    
		    	log.debug("tDBInput_1 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_1.next()) {
		        nb_line_tDBInput_1++;
		        
							if(colQtyInRs_tDBInput_1 < 1) {
								row4.CD_CATEGORIE = null;
							} else {
	                         		
        	row4.CD_CATEGORIE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row4.LB_CATEGORIE = null;
							} else {
	                         		
        	row4.LB_CATEGORIE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row4.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row4.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row4.DT_INSERTION = null;
							} else {
										
			row4.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 4);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row4.BL_LIGNE_ACTIVE = 0;
							} else {
		                          
            row4.BL_LIGNE_ACTIVE = rs_tDBInput_1.getInt(5);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row4.LB_JOB_NAME = null;
							} else {
	                         		
        	row4.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, false);
		                    }
					
						log.debug("tDBInput_1 - Retrieving the record " + nb_line_tDBInput_1 + ".");
					


 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>     <b>tDBInput_1</b>";
		

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>     <b>tDBInput_1</b>";
		

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row4","tDBInput_1","\"ODS_CATEGORIE\"<br>     <b>tDBInput_1</b>","tPostgresqlInput","tAdvancedHash_row4","tAdvancedHash_row4","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row4 - " + (row4==null? "": row4.toLogString()));
    			}
    		


			   
			   

					row4Struct row4_HashRow = new row4Struct();
		   	   	   
				
				row4_HashRow.CD_CATEGORIE = row4.CD_CATEGORIE;
				
				row4_HashRow.LB_CATEGORIE = row4.LB_CATEGORIE;
				
				row4_HashRow.LB_NOM_FICHIER = row4.LB_NOM_FICHIER;
				
				row4_HashRow.DT_INSERTION = row4.DT_INSERTION;
				
				row4_HashRow.BL_LIGNE_ACTIVE = row4.BL_LIGNE_ACTIVE;
				
				row4_HashRow.LB_JOB_NAME = row4.LB_JOB_NAME;
				
			tHash_Lookup_row4.put(row4_HashRow);
			
            




 


	tos_count_tAdvancedHash_row4++;

/**
 * [tAdvancedHash_row4 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";
	
	

 



/**
 * [tAdvancedHash_row4 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";
	
	

 



/**
 * [tAdvancedHash_row4 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>     <b>tDBInput_1</b>";
		

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>     <b>tDBInput_1</b>";
		

	}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
}
globalMap.put("tDBInput_1_NB_LINE",nb_line_tDBInput_1);
	    		log.debug("tDBInput_1 - Retrieved records count: "+nb_line_tDBInput_1 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + ("Done.") );

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";
	
	

tHash_Lookup_row4.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row4",2,0,
			 			"tDBInput_1","\"ODS_CATEGORIE\"<br>     <b>tDBInput_1</b>","tPostgresqlInput","tAdvancedHash_row4","tAdvancedHash_row4","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row4", true);
end_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());




/**
 * [tAdvancedHash_row4 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"ODS_CATEGORIE\"<br>     <b>tDBInput_1</b>";
		

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";
	
	

 



/**
 * [tAdvancedHash_row4 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	

public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tPostjob_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";
	
	
		int tos_count_tPostjob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPostjob_1", "tPostjob_1", "tPostjob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
				}
				tDBCommit_1Process(globalMap);



/**
 * [tPostjob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBCommit_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tDBCommit_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBCommit_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_1", false);
		start_Hash.put("tDBCommit_1", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_1";
	
	
			cLabel="     Commit<br><b>tDBCommit_1</b>";
		
		int tos_count_tDBCommit_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBCommit_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBCommit_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBCommit_1 = new StringBuilder();
                    log4jParamters_tDBCommit_1.append("Parameters:");
                            log4jParamters_tDBCommit_1.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBCommit_1.append(" | ");
                            log4jParamters_tDBCommit_1.append("CLOSE" + " = " + "false");
                        log4jParamters_tDBCommit_1.append(" | ");
                            log4jParamters_tDBCommit_1.append("UNIFIED_COMPONENTS" + " = " + "tPostgresqlCommit");
                        log4jParamters_tDBCommit_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBCommit_1 - "  + (log4jParamters_tDBCommit_1) );
                    } 
                } 
            new BytesLimit65535_tDBCommit_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBCommit_1", "     Commit<br><b>tDBCommit_1</b>", "tPostgresqlCommit");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDBCommit_1 begin ] stop
 */
	
	/**
	 * [tDBCommit_1 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	
			cLabel="     Commit<br><b>tDBCommit_1</b>";
		

	java.sql.Connection conn_tDBCommit_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBCommit_1 != null && !conn_tDBCommit_1.isClosed())
	{
	
			
	    		log.debug("tDBCommit_1 - Connection 'tDBConnection_1' starting to commit.");
			
			conn_tDBCommit_1.commit();
			
	    		log.debug("tDBCommit_1 - Connection 'tDBConnection_1' commit has succeeded.");
			
	
	}

 


	tos_count_tDBCommit_1++;

/**
 * [tDBCommit_1 main ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	
			cLabel="     Commit<br><b>tDBCommit_1</b>";
		

 



/**
 * [tDBCommit_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	
			cLabel="     Commit<br><b>tDBCommit_1</b>";
		

 



/**
 * [tDBCommit_1 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_1 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	
			cLabel="     Commit<br><b>tDBCommit_1</b>";
		

 
                if(log.isDebugEnabled())
            log.debug("tDBCommit_1 - "  + ("Done.") );

ok_Hash.put("tDBCommit_1", true);
end_Hash.put("tDBCommit_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tChronometerStop_1Process(globalMap);



/**
 * [tDBCommit_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBCommit_1 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	
			cLabel="     Commit<br><b>tDBCommit_1</b>";
		

 



/**
 * [tDBCommit_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 1);
	}
	

public void tChronometerStop_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tChronometerStop_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tChronometerStop_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStop_1", false);
		start_Hash.put("tChronometerStop_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStop_1";
	
	
			cLabel="    Fin d'ex\u00E9cution<br><b>tChronometerStop_1</b>";
		
		int tos_count_tChronometerStop_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tChronometerStop_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tChronometerStop_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tChronometerStop_1 = new StringBuilder();
                    log4jParamters_tChronometerStop_1.append("Parameters:");
                            log4jParamters_tChronometerStop_1.append("SINCE_BEGINNING" + " = " + "false");
                        log4jParamters_tChronometerStop_1.append(" | ");
                            log4jParamters_tChronometerStop_1.append("SINCE_STARTER" + " = " + "true");
                        log4jParamters_tChronometerStop_1.append(" | ");
                            log4jParamters_tChronometerStop_1.append("STARTER" + " = " + "tChronometerStart_1");
                        log4jParamters_tChronometerStop_1.append(" | ");
                            log4jParamters_tChronometerStop_1.append("DISPLAY" + " = " + "false");
                        log4jParamters_tChronometerStop_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tChronometerStop_1 - "  + (log4jParamters_tChronometerStop_1) );
                    } 
                } 
            new BytesLimit65535_tChronometerStop_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tChronometerStop_1", "    Fin d'ex\u00E9cution<br><b>tChronometerStop_1</b>", "tChronometerStop");
				talendJobLogProcess(globalMap);
			}
			
	
	long timetChronometerStop_1;
	
		log.info("tChronometerStop_1 - Stop time: "+System.currentTimeMillis()+" milliseconds");
	
	  	timetChronometerStop_1 = System.currentTimeMillis() - ((Long)globalMap.get("tChronometerStart_1")).longValue();
		
			log.info("tChronometerStop_1 - Duration since tChronometerStart_1 start: "+timetChronometerStop_1+" milliseconds");
		
	Long currentTimetChronometerStop_1 = System.currentTimeMillis();
	globalMap.put("tChronometerStop_1", currentTimetChronometerStop_1);
	
		log.info("tChronometerStop_1 - Current time " + currentTimetChronometerStop_1 + " milliseconds");
	
	globalMap.put("tChronometerStop_1_STOPTIME", currentTimetChronometerStop_1);
	globalMap.put("tChronometerStop_1_DURATION", timetChronometerStop_1);
 



/**
 * [tChronometerStop_1 begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";
	
	
			cLabel="    Fin d'ex\u00E9cution<br><b>tChronometerStop_1</b>";
		

 


	tos_count_tChronometerStop_1++;

/**
 * [tChronometerStop_1 main ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";
	
	
			cLabel="    Fin d'ex\u00E9cution<br><b>tChronometerStop_1</b>";
		

 



/**
 * [tChronometerStop_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";
	
	
			cLabel="    Fin d'ex\u00E9cution<br><b>tChronometerStop_1</b>";
		

 



/**
 * [tChronometerStop_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStop_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";
	
	
			cLabel="    Fin d'ex\u00E9cution<br><b>tChronometerStop_1</b>";
		

 
                if(log.isDebugEnabled())
            log.debug("tChronometerStop_1 - "  + ("Done.") );

ok_Hash.put("tChronometerStop_1", true);
end_Hash.put("tChronometerStop_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tJava_2Process(globalMap);



/**
 * [tChronometerStop_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStop_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";
	
	
			cLabel="    Fin d'ex\u00E9cution<br><b>tChronometerStop_1</b>";
		

 



/**
 * [tChronometerStop_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "tJava_2");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_2", false);
		start_Hash.put("tJava_2", System.currentTimeMillis());
		
	
	currentComponent="tJava_2";
	
	
			cLabel="Logs Fin<br><b>tJava_2</b>";
		
		int tos_count_tJava_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJava_2", "Logs Fin<br><b>tJava_2</b>", "tJava");
				talendJobLogProcess(globalMap);
			}
			


System.out.println("Nombre de lignes reçues                       : "+((Integer)globalMap.get("tFileInputDelimited_1_NB_LINE")));

System.out.println("Nombre de lignes rejetées                     : "+((Integer)globalMap.get("tFilterRow_2_NB_LINE_REJECT")));
System.out.println("Nombre de lignes en double                    : "+((Integer)globalMap.get("tUniqRow_1_NB_DUPLICATES")));
System.out.println("-----------------------------------------------------------------------------");
System.out.println("Fin d'exécution du job "+jobName+ "          : "+ 
TalendDate.formatDate("yyyy-MM-dd HH:mm:ss",new java.util.Date(((Long)globalMap.get("tChronometerStop_1_STOPTIME")))
));

System.out.println("Durée totale d'exécution du job "+jobName+ " : "+  
((Long)globalMap.get("tChronometerStop_1_DURATION")) + "");
System.out.println("-----------------------------------------------------------------------------");
 



/**
 * [tJava_2 begin ] stop
 */
	
	/**
	 * [tJava_2 main ] start
	 */

	

	
	
	currentComponent="tJava_2";
	
	
			cLabel="Logs Fin<br><b>tJava_2</b>";
		

 


	tos_count_tJava_2++;

/**
 * [tJava_2 main ] stop
 */
	
	/**
	 * [tJava_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_2";
	
	
			cLabel="Logs Fin<br><b>tJava_2</b>";
		

 



/**
 * [tJava_2 process_data_begin ] stop
 */
	
	/**
	 * [tJava_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_2";
	
	
			cLabel="Logs Fin<br><b>tJava_2</b>";
		

 



/**
 * [tJava_2 process_data_end ] stop
 */
	
	/**
	 * [tJava_2 end ] start
	 */

	

	
	
	currentComponent="tJava_2";
	
	
			cLabel="Logs Fin<br><b>tJava_2</b>";
		

 

ok_Hash.put("tJava_2", true);
end_Hash.put("tJava_2", System.currentTimeMillis());




/**
 * [tJava_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_2 finally ] start
	 */

	

	
	
	currentComponent="tJava_2";
	
	
			cLabel="Logs Fin<br><b>tJava_2</b>";
		

 



/**
 * [tJava_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_2_SUBPROCESS_STATE", 1);
	}
	

public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		org.slf4j.MDC.put("_subJobName", "talendJobLog");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [talendJobLog begin ] start
	 */

	

	
		
		ok_Hash.put("talendJobLog", false);
		start_Hash.put("talendJobLog", System.currentTimeMillis());
		
	
	currentComponent="talendJobLog";
	
	
		int tos_count_talendJobLog = 0;
		

	for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
		org.talend.job.audit.JobContextBuilder builder_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
			.custom("process_id", jcm.pid).custom("thread_id", jcm.tid).custom("pid", pid).custom("father_pid", fatherPid).custom("root_pid", rootPid);
		org.talend.logging.audit.Context log_context_talendJobLog = null;
		
		
		if(jcm.log_type == JobStructureCatcherUtils.LogType.PERFORMANCE){
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.sourceId(jcm.sourceId).sourceLabel(jcm.sourceLabel).sourceConnectorType(jcm.sourceComponentName)
				.targetId(jcm.targetId).targetLabel(jcm.targetLabel).targetConnectorType(jcm.targetComponentName)
				.connectionName(jcm.current_connector).rows(jcm.row_count).duration(duration).build();
			auditLogger_talendJobLog.flowExecution(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBSTART) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).build();
			auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBEND) {
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
		
			log_context_talendJobLog = builder_talendJobLog
				.timestamp(jcm.moment).duration(duration).status(jcm.status).build();
			auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.RUNCOMPONENT) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment)
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label).build();
			auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWINPUT) {//log current component input line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWOUTPUT) {//log current component output/reject line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBERROR) {
			java.lang.Exception e_talendJobLog = jcm.exception;
			if(e_talendJobLog!=null) {
				try(java.io.StringWriter sw_talendJobLog = new java.io.StringWriter();java.io.PrintWriter pw_talendJobLog = new java.io.PrintWriter(sw_talendJobLog)) {
					e_talendJobLog.printStackTrace(pw_talendJobLog);
					builder_talendJobLog.custom("stacktrace", sw_talendJobLog.getBuffer().substring(0,java.lang.Math.min(sw_talendJobLog.getBuffer().length(), 512)));
				}
			}

			if(jcm.extra_info!=null) {
				builder_talendJobLog.connectorId(jcm.component_id).custom("extra_info", jcm.extra_info);
			}
				
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_id.substring(0, jcm.component_id.lastIndexOf('_')))
				.connectorId(jcm.component_id)
				.connectorLabel(jcm.component_label == null ? jcm.component_id : jcm.component_label).build();

			auditLogger_talendJobLog.exception(log_context_talendJobLog);
		}
		
		
		
	}

 



/**
 * [talendJobLog begin ] stop
 */
	
	/**
	 * [talendJobLog main ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 


	tos_count_talendJobLog++;

/**
 * [talendJobLog main ] stop
 */
	
	/**
	 * [talendJobLog process_data_begin ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog process_data_begin ] stop
 */
	
	/**
	 * [talendJobLog process_data_end ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog process_data_end ] stop
 */
	
	/**
	 * [talendJobLog end ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 

ok_Hash.put("talendJobLog", true);
end_Hash.put("talendJobLog", System.currentTimeMillis());




/**
 * [talendJobLog end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendJobLog finally ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendJobLog_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    
    
    private final static java.util.Properties jobInfo = new java.util.Properties();

    public static void main(String[] args){
        final jOdsCategorie jOdsCategorieClass = new jOdsCategorie();

        int exitCode = jOdsCategorieClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'jOdsCategorie' - Done.");
	        }

        System.exit(exitCode);
    }
	

	
	
	private void getjobInfo() {
		final String TEMPLATE_PATH = "src/main/templates/jobInfo_template.properties";
		final String BUILD_PATH = "../jobInfo.properties";
		final String path = this.getClass().getResource("").getPath();
		if(path.lastIndexOf("target") > 0) {
			final java.io.File templateFile = new java.io.File(
					path.substring(0, path.lastIndexOf("target")).concat(TEMPLATE_PATH));
			if (templateFile.exists()) {
				readJobInfo(templateFile);
				return;
			}
		}
			readJobInfo(new java.io.File(BUILD_PATH));
	}

    private void readJobInfo(java.io.File jobInfoFile){
	
        if(jobInfoFile.exists()) {
            try {
            	jobInfo.load(new java.io.FileInputStream(jobInfoFile));
            } catch (IOException e) {
            	 
                log.debug("Read jobInfo.properties file fail: " + e.getMessage());
                
            }
        }
		log.info(String.format("Project name: %s\tJob name: %s\tGIT Commit ID: %s\tTalend Version: %s",
				projectName,jobName,jobInfo.getProperty("gitCommitId"), "8.0.1.20220923_1236-patch"));
		
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

	        if(!"".equals(log4jLevel)){
	        	
				
				
				if("trace".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.OFF);
				}
				org.apache.logging.log4j.core.config.Configurator.setLevel(org.apache.logging.log4j.LogManager.getRootLogger().getName(), log.getLevel());
				
			}

	        getjobInfo();
			log.info("TalendJob: 'jOdsCategorie' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_iUWBUCoJEe62wqBezdUyXw");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-07-28T12:58:44.329388500Z");

                java.lang.management.RuntimeMXBean mx = java.lang.management.ManagementFactory.getRuntimeMXBean();
                String[] mxNameTable = mx.getName().split("@"); //$NON-NLS-1$
                if (mxNameTable.length == 2) {
                    org.slf4j.MDC.put("_systemPid", mxNameTable[0]);
                } else {
                    org.slf4j.MDC.put("_systemPid", String.valueOf(java.lang.Thread.currentThread().getId()));
                }

		
		
			if(enableLogStash) {
				java.util.Properties properties_talendJobLog = new java.util.Properties();
				properties_talendJobLog.setProperty("root.logger", "audit");
				properties_talendJobLog.setProperty("encoding", "UTF-8");
				properties_talendJobLog.setProperty("application.name", "Talend Studio");
				properties_talendJobLog.setProperty("service.name", "Talend Studio Job");
				properties_talendJobLog.setProperty("instance.name", "Talend Studio Job Instance");
				properties_talendJobLog.setProperty("propagate.appender.exceptions", "none");
				properties_talendJobLog.setProperty("log.appender", "file");
				properties_talendJobLog.setProperty("appender.file.path", "audit.json");
				properties_talendJobLog.setProperty("appender.file.maxsize", "52428800");
				properties_talendJobLog.setProperty("appender.file.maxbackup", "20");
				properties_talendJobLog.setProperty("host", "false");

				System.getProperties().stringPropertyNames().stream()
					.filter(it -> it.startsWith("audit.logger."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("audit.logger.".length()), System.getProperty(key)));

				
				
				
				org.apache.logging.log4j.core.config.Configurator.setLevel(properties_talendJobLog.getProperty("root.logger"), org.apache.logging.log4j.Level.DEBUG);
				
				auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory.createJobAuditLogger(properties_talendJobLog);
			}
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

            org.slf4j.MDC.put("_pid", pid);

        if (rootPid==null) {
            rootPid = pid;
        }

            org.slf4j.MDC.put("_rootPid", rootPid);

        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }
            org.slf4j.MDC.put("_fatherPid", fatherPid);

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }
        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        try {
            java.util.Dictionary<String, Object> jobProperties = null;
            if (inOSGi) {
                jobProperties = routines.system.BundleUtils.getJobProperties(jobName);
    
                if (jobProperties != null && jobProperties.get("context") != null) {
                    contextStr = (String)jobProperties.get("context");
                }
            }
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = jOdsCategorie.class.getClassLoader().getResourceAsStream("icommerce_reporting/jodscategorie_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = jOdsCategorie.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
    	                defaultProps.load(inContext);
    	                if (inOSGi && jobProperties != null) {
                             java.util.Enumeration<String> keys = jobProperties.keys();
                             while (keys.hasMoreElements()) {
                                 String propKey = keys.nextElement();
                                 if (defaultProps.containsKey(propKey)) {
                                     defaultProps.put(propKey, (String) jobProperties.get(propKey));
                                 }
                             }
    	                }
    	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("schema_ods", "id_String");
                        if(context.getStringValue("schema_ods") == null) {
                            context.schema_ods = null;
                        } else {
                            context.schema_ods=(String) context.getProperty("schema_ods");
                        }
                        context.setContextType("additionalParam", "id_String");
                        if(context.getStringValue("additionalParam") == null) {
                            context.additionalParam = null;
                        } else {
                            context.additionalParam=(String) context.getProperty("additionalParam");
                        }
                        context.setContextType("database", "id_String");
                        if(context.getStringValue("database") == null) {
                            context.database = null;
                        } else {
                            context.database=(String) context.getProperty("database");
                        }
                        context.setContextType("password", "id_String");
                        if(context.getStringValue("password") == null) {
                            context.password = null;
                        } else {
                            context.password=(String) context.getProperty("password");
                        }
                        context.setContextType("port", "id_String");
                        if(context.getStringValue("port") == null) {
                            context.port = null;
                        } else {
                            context.port=(String) context.getProperty("port");
                        }
                        context.setContextType("schema_param", "id_String");
                        if(context.getStringValue("schema_param") == null) {
                            context.schema_param = null;
                        } else {
                            context.schema_param=(String) context.getProperty("schema_param");
                        }
                        context.setContextType("serverName", "id_String");
                        if(context.getStringValue("serverName") == null) {
                            context.serverName = null;
                        } else {
                            context.serverName=(String) context.getProperty("serverName");
                        }
                        context.setContextType("utilisateur", "id_String");
                        if(context.getStringValue("utilisateur") == null) {
                            context.utilisateur = null;
                        } else {
                            context.utilisateur=(String) context.getProperty("utilisateur");
                        }
                        context.setContextType("encodage", "id_String");
                        if(context.getStringValue("encodage") == null) {
                            context.encodage = null;
                        } else {
                            context.encodage=(String) context.getProperty("encodage");
                        }
                        context.setContextType("fieldSeparator", "id_String");
                        if(context.getStringValue("fieldSeparator") == null) {
                            context.fieldSeparator = null;
                        } else {
                            context.fieldSeparator=(String) context.getProperty("fieldSeparator");
                        }
                        context.setContextType("projectFolder", "id_Directory");
                        if(context.getStringValue("projectFolder") == null) {
                            context.projectFolder = null;
                        } else {
                            context.projectFolder=(String) context.getProperty("projectFolder");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("schema_ods")) {
                context.schema_ods = (String) parentContextMap.get("schema_ods");
            }if (parentContextMap.containsKey("additionalParam")) {
                context.additionalParam = (String) parentContextMap.get("additionalParam");
            }if (parentContextMap.containsKey("database")) {
                context.database = (String) parentContextMap.get("database");
            }if (parentContextMap.containsKey("password")) {
                context.password = (String) parentContextMap.get("password");
            }if (parentContextMap.containsKey("port")) {
                context.port = (String) parentContextMap.get("port");
            }if (parentContextMap.containsKey("schema_param")) {
                context.schema_param = (String) parentContextMap.get("schema_param");
            }if (parentContextMap.containsKey("serverName")) {
                context.serverName = (String) parentContextMap.get("serverName");
            }if (parentContextMap.containsKey("utilisateur")) {
                context.utilisateur = (String) parentContextMap.get("utilisateur");
            }if (parentContextMap.containsKey("encodage")) {
                context.encodage = (String) parentContextMap.get("encodage");
            }if (parentContextMap.containsKey("fieldSeparator")) {
                context.fieldSeparator = (String) parentContextMap.get("fieldSeparator");
            }if (parentContextMap.containsKey("projectFolder")) {
                context.projectFolder = (String) parentContextMap.get("projectFolder");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,ContextProperties.class,parametersToEncrypt));

            org.slf4j.MDC.put("_context", contextStr);
            log.info("TalendJob: 'jOdsCategorie' - Started.");

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();

try {
errorCode = null;Implicit_Context_DatabaseProcess(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_Implicit_Context_Database) {
globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", -1);

e_Implicit_Context_Database.printStackTrace();

}

this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}



		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tFileList_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tFileList_1) {
globalMap.put("tFileList_1_SUBPROCESS_STATE", -1);

e_tFileList_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : jOdsCategorie");
        }
		if(enableLogStash) {
	        talendJobLog.addJobEndMessage(startTime, end, status);
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");
    resumeUtil.flush();


        org.slf4j.MDC.remove("_subJobName");
        org.slf4j.MDC.remove("_subJobPid");
        org.slf4j.MDC.remove("_systemPid");
        log.info("TalendJob: 'jOdsCategorie' - Finished - status: " + status + " returnCode: " + returnCode );

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     466085 characters generated by Talend Cloud Data Fabric 
 *     on the July 28, 2023 at 2:58:44 PM CEST
 ************************************************************************************************/