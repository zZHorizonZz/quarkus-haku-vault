package io.quarkiverse.haku.vault.common;

import java.util.Set;

public interface Bucket {

    String getBucketName();

    Set<BucketObject> listObjects();
}
