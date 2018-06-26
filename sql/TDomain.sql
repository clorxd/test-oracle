--------------------------------------------------------
--  文件已创建 - 星期二-六月-26-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table T_DOMAIN
--------------------------------------------------------

  CREATE TABLE "T_DOMAIN" 
   (	"OID" NUMBER, 
	"DOMAIN_NAME" VARCHAR2(50 BYTE), 
	"DOMAIN_DESC" VARCHAR2(255 BYTE), 
	"DOMAIN_URL" VARCHAR2(255 BYTE), 
	"TECH_DEPART" VARCHAR2(255 BYTE), 
	"TECH_PERSON" VARCHAR2(50 BYTE), 
	"PRO_PERSON" VARCHAR2(50 BYTE), 
	"PRO_DEPART" VARCHAR2(255 BYTE), 
	"TEST_IP" VARCHAR2(255 BYTE), 
	"TEST_WEBPATH" VARCHAR2(255 BYTE), 
	"IS_DEL" CHAR(1 BYTE) DEFAULT 0, 
	"OUTIME" TIMESTAMP (7) DEFAULT sysdate, 
	"OITIME" TIMESTAMP (7) DEFAULT sysdate, 
	"DOMAIN_INDEX" VARCHAR2(255 BYTE), 
	"DOMAIN_NO" VARCHAR2(50 BYTE)
   )
--------------------------------------------------------
--  Constraints for Table T_DOMAIN
--------------------------------------------------------

  ALTER TABLE "BURIED"."T_DOMAIN" MODIFY ("OID" NOT NULL ENABLE);
