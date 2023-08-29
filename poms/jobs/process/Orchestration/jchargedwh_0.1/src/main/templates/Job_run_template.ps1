$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Dtalend.component.manager.m2.repository=%cd%/../lib' '-Xms256M' '-Xmx1024M' -cp '.;../lib/routines.jar;../lib/log4j-slf4j-impl-2.17.1.jar;../lib/log4j-api-2.17.1.jar;../lib/log4j-core-2.17.1.jar;../lib/log4j-1.2-api-2.17.1.jar;../lib/accessors-smart-2.4.7.jar;../lib/commons-collections-3.2.2.jar;../lib/asm-9.1.jar;../lib/audit-log4j2-1.16.1.jar;../lib/jboss-marshalling-2.0.12.Final.jar;../lib/advancedPersistentLookupLib-1.4.jar;../lib/talend_file_enhanced-1.1.jar;../lib/thashfile-3.1-20190910.jar;../lib/logging-event-layout-1.16.1.jar;../lib/json-smart-2.4.7.jar;../lib/commons-lang3-3.10.jar;../lib/job-audit-1.5.jar;../lib/dom4j-2.1.3.jar;../lib/slf4j-api-1.7.29.jar;../lib/trove.jar;../lib/postgresql-42.2.26.jar;../lib/audit-common-1.16.1.jar;../lib/jboss-marshalling-river-2.0.12.Final.jar;../lib/crypto-utils-0.31.12.jar;jchargedwh_0_1.jar;jdwhclient_0_1.jar;jdwhproduit_0_1.jar;jdwhvente_0_1.jar;' icommerce_reporting.jchargedwh_0_1.jChargeDWH --context=Default $args
