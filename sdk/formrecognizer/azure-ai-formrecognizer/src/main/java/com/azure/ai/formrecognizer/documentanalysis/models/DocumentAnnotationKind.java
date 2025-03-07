// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Annotation kind. */
public final class DocumentAnnotationKind extends ExpandableStringEnum<DocumentAnnotationKind> {
    /** Static value check for DocumentAnnotationKind. */
    public static final DocumentAnnotationKind CHECK = fromString("check");

    /** Static value cross for DocumentAnnotationKind. */
    public static final DocumentAnnotationKind CROSS = fromString("cross");

    /**
     * Creates a new instance of DocumentAnnotationKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DocumentAnnotationKind() {}

    /**
     * Creates or finds a DocumentAnnotationKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DocumentAnnotationKind.
     */
    @JsonCreator
    public static DocumentAnnotationKind fromString(String name) {
        return fromString(name, DocumentAnnotationKind.class);
    }

    /**
     * Gets known DocumentAnnotationKind values.
     *
     * @return known DocumentAnnotationKind values.
     */
    public static Collection<DocumentAnnotationKind> values() {
        return values(DocumentAnnotationKind.class);
    }
}
