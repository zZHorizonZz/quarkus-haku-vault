package io.quarkiverse.haku.vault.common.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class HakuVaultProcessor {

    private static final String FEATURE = "haku-vault";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
