package com.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BuildConfigTest {

    @Test
    public void application_id_test() {
        assertThat(BuildConfig.APPLICATION_ID).isEqualTo("com.justanotherandroidapp");
    }

    @Test
    public void build_type_test() {
        assertThat(BuildConfig.BUILD_TYPE).isEqualTo("release");
    }

    @Test
    public void build_time_generated_for_release_builds() {
        assertThat(BuildConfig.BUILD_TIME).isNotEqualToIgnoringCase("DEBUG");
    }

    @Test
    public void git_sha_generated_for_release_builds() {
        assertThat(BuildConfig.GIT_SHA).isNotEqualToIgnoringCase("DEBUG");
    }

}
