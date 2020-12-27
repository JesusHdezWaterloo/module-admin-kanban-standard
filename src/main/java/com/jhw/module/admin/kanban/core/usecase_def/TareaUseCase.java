package com.jhw.module.admin.kanban.core.usecase_def;

import com.clean.core.app.usecase.CRUDUseCase;
import com.clean.core.utils.Licenced;
import com.jhw.module.admin.kanban.core.domain.ColumnaProyectVolatile;
import com.jhw.module.admin.kanban.core.domain.MoveTarea;
import com.jhw.module.admin.kanban.core.domain.TareaDomain;
import java.util.List;

public interface TareaUseCase extends CRUDUseCase<TareaDomain> {

    public List<TareaDomain> findByColumnaProyecto(ColumnaProyectVolatile.LightWeigth colProy) throws Exception;

    @Licenced
    public TareaDomain move(MoveTarea move) throws Exception;
}
