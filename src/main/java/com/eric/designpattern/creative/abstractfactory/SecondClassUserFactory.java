package com.eric.designpattern.creative.abstractfactory;

import com.eric.designpattern.creative.bean.CouchUser;
import com.eric.designpattern.creative.bean.DocumentUser;
import com.eric.designpattern.creative.bean.RelationalUser;
import com.eric.designpattern.creative.bean.SqlUser;

/**
 * @author eric
 * SQL Server: Rank 3 in Relational DBs
 * CouchDB: Rank 5 in Document DBs
 */
public final class SecondClassUserFactory implements IUserFactory {
    @Override
    public RelationalUser getRelationalUser() {
        return new SqlUser();
    }

    @Override
    public DocumentUser getDocumentUser() {
        return new CouchUser();
    }
}
