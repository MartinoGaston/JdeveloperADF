-- <?xml version = '1.0' encoding = 'UTF-8'?>
-- <trigger xmlns="http://xmlns.oracle.com/jdeveloper/1211/offlinedb">
--   <name>PERSONS_TRG</name>
--   <enabled>true</enabled>
--   <properties>
--     <entry>
--       <key>OfflineDBConstants.IMPORT_SOURCE_CONNECTION</key>
--       <value class="java.lang.String">DBDEMOConn</value>
--     </entry>
--     <entry>
--       <key>OfflineDBConstants.IMPORT_SOURCE_ID</key>
--       <value class="oracle.javatools.db.ReferenceID">
--         <name>PERSONS_TRG</name>
--         <identifier class="java.math.BigDecimal">21408</identifier>
--         <schemaName>DBDEMO</schemaName>
--         <type>TRIGGER</type>
--       </value>
--     </entry>
--   </properties>
--   <statementLevel>true</statementLevel>
-- </trigger>

CREATE OR REPLACE
TRIGGER PERSONS_TRG 
BEFORE INSERT ON PERSONS 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.PERSON_ID IS NULL THEN
      SELECT PERSONS_SEQ.NEXTVAL INTO :NEW.PERSON_ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
