package resources;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;

import static net.serenitybdd.core.environment.ConfiguredEnvironment.getEnvironmentVariables;

public class GlobalConfig {
    public static final String MAIN_URL = EnvironmentSpecificConfiguration.from(getEnvironmentVariables()).getProperty("base.url");
    public static final String HOME_PAGE_URL = EnvironmentSpecificConfiguration.from(getEnvironmentVariables()).getProperty("homePage.url");
}
