package com.eric.designpattern.creative.abstractfactory;

import com.eric.designpattern.creative.bean.DocumentUser;
import com.eric.designpattern.creative.bean.RelationalUser;

/**
 * @author eric
 */
public interface IUserFactory {

    RelationalUser getRelationalUser();

    DocumentUser getDocumentUser();
}
