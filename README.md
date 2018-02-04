Oracle DB Password reset tool
====================

#### This is command line Oracle DB Monitoring tool. Alternative to Oracle Enterprise Manager (OEM). 

- It presents key metrics from multiple OEM Pages in single pane of glass. <br />
- It does not require browser/GUI. It only need access to port 22 or 1521 on Oracle db host. <br />
- It works for Real Application Cluster and Single node configuration. <br />
- It is best to run on clients where Cssh is available (MacOS or Linux). 
- It does not replace OEM, but it is very useful tool where OEM is not available. 

<img src="readme/db-password-reset-tool-icon.png" width="200">

## Installation

### For MacOS clients: 

```Shell
# install csshX
git clone https://github.com/brockgr/csshx.git

# install oracle-db-monitor
git clone https://github.com/AVM-Consulting/oracle-db-monitor.git

# copy .sql file to db host.. in RAC configuration, can copy file to any single rac node.
scp oracle-db-monitor/oramonitor__*.sql  amoseyev@mydbhost1:/tmp

# spin 8 ssh session to the node
csshx/csshX oracle@mydbhost{1,1,1,1,1,1,1,1}.mycompany.com
```

In each open ssh session run oramonitor__*.sql script: 8 sessions, 8 scripts. <br />
(Argument 5, is monitoring window of 5 seconds)

In session 1:
```Shell
oracle@mydbhost1:~$ sqlplus -s / as sysdba @/tmp/oramonitor__1_DB_ash.sql 5
```

