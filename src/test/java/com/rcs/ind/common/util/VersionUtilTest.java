package com.rcs.ind.common.util;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.io.File;

import org.junit.Test;

public class VersionUtilTest {

	private static final String TEST_JAR = "./build/libs/ind-util.jar";

	@Test
	public void testGetManifestVersionInfo() {
		assertThat(VersionUtil.getManifestVersionInfo(null), is("No version found"));

		// This set of asserts is only executed provided a jar is found in the location stored in TEST_JAR. Only if target "build" has been executed before.
		if (new File(TEST_JAR).exists()) {
			String version = VersionUtil.getManifestVersionInfo(TEST_JAR);
			assertThat(version, is(notNullValue()));
			assertThat(version, is(not("No version found")));
		}
	}
}