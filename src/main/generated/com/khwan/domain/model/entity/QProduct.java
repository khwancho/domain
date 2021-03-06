package com.khwan.domain.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = -928515105L;

    public static final QProduct product = new QProduct("product");

    public final StringPath description = createString("description");

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final StringPath origin = createString("origin");

    public final StringPath productName = createString("productName");

    public final NumberPath<Long> prudctId = createNumber("prudctId", Long.class);

    public QProduct(String variable) {
        super(Product.class, forVariable(variable));
    }

    public QProduct(Path<? extends Product> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduct(PathMetadata metadata) {
        super(Product.class, metadata);
    }

}

