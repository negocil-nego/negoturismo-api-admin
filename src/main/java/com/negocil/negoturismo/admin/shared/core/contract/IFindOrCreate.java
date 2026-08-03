package com.negocil.negoturismo.admin.shared.core.contract;

import com.negocil.negoturismo.admin.shared.core.model.CommonModel;

@FunctionalInterface
public interface IFindOrCreate<T extends CommonModel> {
    T findOrCreate(T model);
}
