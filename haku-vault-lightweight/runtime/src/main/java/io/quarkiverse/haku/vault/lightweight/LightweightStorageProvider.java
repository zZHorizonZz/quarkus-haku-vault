package io.quarkiverse.haku.vault.lightweight;

import io.quarkiverse.haku.vault.common.Bucket;
import io.quarkiverse.haku.vault.common.BucketObject;
import io.quarkiverse.haku.vault.common.BucketObjectVersion;
import io.quarkiverse.haku.vault.common.BucketStorage;

import java.util.List;

public class LightweightStorageProvider implements BucketStorage {

    private final String storagePath;

    public LightweightStorageProvider(String storagePath) {
        this.storagePath = storagePath;
    }

    @Override
    public Bucket getBucket(String bucketName) {
        return null;
    }

    @Override
    public BucketObject getObject(String bucketName, String objectName) {
        return null;
    }

    @Override
    public BucketObjectVersion getObjectVersion(String bucketName, String objectName, int versionId) {
        return null;
    }

    @Override
    public List<Bucket> listBuckets() {
        return null;
    }

    @Override
    public List<BucketObject> listObjects(String bucketName) {
        return null;
    }

    @Override
    public List<BucketObjectVersion> listObjectVersions(String bucketName, String objectName) {
        return null;
    }

    @Override
    public void storeBucket(Bucket bucket) {

    }

    @Override
    public void storeObject(BucketObject object) {

    }

    @Override
    public void storeObjectVersion(BucketObjectVersion objectVersion) {

    }

    @Override
    public void deleteBucket(String bucketName) {

    }

    @Override
    public void deleteObject(String bucketName, String objectName) {

    }

    @Override
    public void deleteObjectVersion(String bucketName, String objectName, int versionId) {

    }

    @Override
    public byte[] readAllBytes(String bucketName, String objectName) {
        return new byte[0];
    }

    @Override
    public byte[] readAllBytes(String bucketName, String objectName, int versionId) {
        return new byte[0];
    }

    @Override
    public void writeAllBytes(String bucketName, String objectName, byte[] bytes) {

    }

    @Override
    public void writeAllBytes(String bucketName, String objectName, int versionId, byte[] bytes) {

    }
}
