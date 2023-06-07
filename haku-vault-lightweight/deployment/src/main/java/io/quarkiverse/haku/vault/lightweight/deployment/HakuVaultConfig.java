package io.quarkiverse.haku.vault.lightweight.deployment;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(name = "haku-vault", phase = ConfigPhase.BUILD_TIME)
public class HakuVaultConfig {

    @ConfigItem(name = "storage-path")
    String storagePath;
}
