package io.quarkiverse.haku.vault.common;

import java.util.List;

public interface BucketStorage {

    Bucket getBucket(String bucketName);

    BucketObject getObject(String bucketName, String objectName);

    BucketObjectVersion getObjectVersion(String bucketName, String objectName, int versionId);

    List<Bucket> listBuckets();

    List<BucketObject> listObjects(String bucketName);

    List<BucketObjectVersion> listObjectVersions(String bucketName, String objectName);

    void storeBucket(Bucket bucket);

    void storeObject(BucketObject object);

    void storeObjectVersion(BucketObjectVersion objectVersion);

    void deleteBucket(String bucketName);

    void deleteObject(String bucketName, String objectName);

    void deleteObjectVersion(String bucketName, String objectName, int versionId);

    byte[] readAllBytes(String bucketName, String objectName);

    byte[] readAllBytes(String bucketName, String objectName, int versionId);

    void writeAllBytes(String bucketName, String objectName, byte[] bytes);

    void writeAllBytes(String bucketName, String objectName, int versionId, byte[] bytes);
}
