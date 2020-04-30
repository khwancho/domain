package com.khwan.domain.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCode is a Querydsl query type for Code
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCode extends EntityPathBase<Code> {

    private static final long serialVersionUID = 992765181L;

    public static final QCode code = new QCode("code");

    public final NumberPath<Long> codeId = createNumber("codeId", Long.class);

    public final StringPath detailCode = createString("detailCode");

    public final StringPath detailName = createString("detailName");

    public final StringPath groupCode = createString("groupCode");

    public final StringPath groupName = createString("groupName");

    public QCode(String variable) {
        super(Code.class, forVariable(variable));
    }

    public QCode(Path<? extends Code> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCode(PathMetadata metadata) {
        super(Code.class, metadata);
    }

}

