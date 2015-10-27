package com.rcs.ind.common.util;

import java.io.File;
import java.util.jar.Attributes.Name;
import java.util.jar.JarFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VersionUtil {

	private static final Logger logger = LoggerFactory.getLogger(VersionUtil.class);

	public static String getManifestVersionInfo(String filePath) {
		try (JarFile jarFile = new JarFile(new File(filePath))) {
			return jarFile.getManifest().getMainAttributes().getValue(Name.IMPLEMENTATION_VERSION);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return "No version found";
	}
}