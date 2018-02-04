WHENEVER SQLERROR EXIT SQL.SQLCODE 
set verify off
set echo off
conn &uname_conn/&passw_conn@&inst
prompt &&uanme_change
prompt
prompt Changing password for &uanme_change
prompt
alter user &uanme_change identified by "&passw_change";
exit

