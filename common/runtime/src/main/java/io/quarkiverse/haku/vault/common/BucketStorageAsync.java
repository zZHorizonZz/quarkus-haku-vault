package io.quarkiverse.haku.vault.common;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

public interface BucketStorageAsync {

    Uni<Bucket> getBucket(String bucketName);

    Uni<BucketObject> getObject(String bucketName, String objectName);

    Uni<BucketObjectVersion> getObjectVersion(String bucketName, String objectName, int versionId);

    Uni<Void> storeBucket(Bucket bucket);

    Uni<Void> deleteBucket(String bucketName);

    Uni<Void> deleteObject(String bucketName, String objectName);

    Uni<Void> deleteObjectVersion(String bucketName, String objectName, int versionId);

    Multi<Byte> readAllBytes(String bucketName, String objectName);

    Multi<Byte> readAllBytes(String bucketName, String objectName, int versionId);

    Uni<Void> writeAllBytes(String bucketName, String objectName, byte[] bytes);

    Uni<Void> writeAllBytes(String bucketName, String objectName, int versionId, byte[] bytes);
}
