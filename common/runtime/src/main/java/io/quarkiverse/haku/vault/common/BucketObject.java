package io.quarkiverse.haku.vault.common;

import java.util.Set;

public interface BucketObject {

    String getBucketName();

    String getObjectName();

    Set<BucketObjectVersion> listObjectVersions();
}
