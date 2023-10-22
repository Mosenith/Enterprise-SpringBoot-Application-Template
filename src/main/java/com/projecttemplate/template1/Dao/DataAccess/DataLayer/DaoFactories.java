package com.projecttemplate.template1.Dao.DataAccess.DataLayer;

import com.projecttemplate.template1.Dao.DataAccess.DataLayer.MySql.MySqlDaoFactory;
import com.projecttemplate.template1.Dao.DataAccess.DataLayer.SqlServer.SqlServerDaoFactory;

public class DaoFactories {
    public static IDaoFactory getFactory(String dataProvider) {
        switch (dataProvider) {
            case "SqlExpress":
            case "SqlServer": return new SqlServerDaoFactory();
            case "MySql": return new MySqlDaoFactory();
    
            // Default: SqlServer
            default: return new SqlServerDaoFactory();
        }
    }
}
