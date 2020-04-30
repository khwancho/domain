package com.khwan.domain.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFile is a Querydsl query type for File
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFile extends EntityPathBase<File> {

    private static final long serialVersionUID = 992849036L;

    public static final QFile file = new QFile("file");

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final StringPath filename = createString("filename");

    public final StringPath location = createString("location");

    public final StringPath realName = createString("realName");

    public final StringPath type = createString("type");

    public final StringPath typeId = createString("typeId");

    public QFile(String variable) {
        super(File.class, forVariable(variable));
    }

    public QFile(Path<? extends File> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFile(PathMetadata metadata) {
        super(File.class, metadata);
    }

}

