package com.eric.designpattern.creative.abstractfactory;

import com.eric.designpattern.creative.bean.DocumentUser;
import com.eric.designpattern.creative.bean.MongoUser;
import com.eric.designpattern.creative.bean.OracleUser;
import com.eric.designpattern.creative.bean.RelationalUser;

/**
 * @author eric
 * Oracle: Rank 1 in Relational DBs
 * MongoDB: Rank 1 in Document DBs
 */
public final class FirstClassUserFactory implements IUserFactory {
    @Override
    public RelationalUser getRelationalUser() {
        return new OracleUser();
    }

    @Override
    public DocumentUser getDocumentUser() {
        return new MongoUser();
    }
}
