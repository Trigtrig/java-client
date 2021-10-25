/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appium.java_client.android.options;

import io.appium.java_client.android.options.app.SupportsAllowTestPackagesOption;
import io.appium.java_client.android.options.app.SupportsAndroidInstallTimeoutOption;
import io.appium.java_client.android.options.app.SupportsAppActivityOption;
import io.appium.java_client.android.options.app.SupportsAppDurationOption;
import io.appium.java_client.android.options.app.SupportsAppPackageOption;
import io.appium.java_client.android.options.app.SupportsAppWaitActivityOption;
import io.appium.java_client.android.options.app.SupportsAppWaitForLaunchOption;
import io.appium.java_client.android.options.app.SupportsAppWaitPackageOption;
import io.appium.java_client.android.options.app.SupportsAutoGrantPermissionsOption;
import io.appium.java_client.android.options.app.SupportsEnforceAppInstallOption;
import io.appium.java_client.android.options.app.SupportsIntentActionOption;
import io.appium.java_client.android.options.app.SupportsIntentCategoryOption;
import io.appium.java_client.android.options.app.SupportsIntentFlagsOption;
import io.appium.java_client.android.options.app.SupportsOptionalIntentArgumentsOption;
import io.appium.java_client.android.options.app.SupportsRemoteAppsCacheLimitOption;
import io.appium.java_client.android.options.app.SupportsUninstallOtherPackagesOption;
import io.appium.java_client.android.options.server.SupportsDisableWindowAnimationOption;
import io.appium.java_client.android.options.server.SupportsSkipDeviceInitializationOption;
import io.appium.java_client.android.options.server.SupportsSkipServerInstallationOption;
import io.appium.java_client.android.options.server.SupportsSystemPortOption;
import io.appium.java_client.android.options.server.SupportsUiautomator2ServerInstallTimeoutOption;
import io.appium.java_client.android.options.server.SupportsUiautomator2ServerLaunchTimeoutOption;
import io.appium.java_client.android.options.server.SupportsUiautomator2ServerReadTimeoutOption;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.remote.options.SupportsAppOption;
import io.appium.java_client.remote.options.SupportsAutoWebViewOption;
import io.appium.java_client.remote.options.SupportsClearSystemFilesOption;
import io.appium.java_client.remote.options.SupportsDeviceNameOption;
import io.appium.java_client.remote.options.SupportsEnablePerformanceLoggingOption;
import io.appium.java_client.remote.options.SupportsLanguageOption;
import io.appium.java_client.remote.options.SupportsLocaleOption;
import io.appium.java_client.remote.options.SupportsOrientationOption;
import io.appium.java_client.remote.options.SupportsOtherAppsOption;
import io.appium.java_client.remote.options.SupportsUdidOption;
import org.openqa.selenium.Capabilities;

/**
 * https://github.com/appium/appium-uiautomator2-driver#capabilities
 */
public class UiAutomator2Options extends BaseOptions<UiAutomator2Options> implements
        // TODO: ADB options: https://github.com/appium/appium-uiautomator2-driver#adb
        // TODO: AVD options: https://github.com/appium/appium-uiautomator2-driver#emulator-android-virtual-device
        // TODO: App signing options: https://github.com/appium/appium-uiautomator2-driver#app-signing
        // TODO: Device locking options: https://github.com/appium/appium-uiautomator2-driver#device-locking
        // TODO: MJPEG options: https://github.com/appium/appium-uiautomator2-driver#mjpeg
        // TODO: Web Context options: https://github.com/appium/appium-uiautomator2-driver#web-context
        // TODO: Other options: https://github.com/appium/appium-uiautomator2-driver#other
        // TODO: Shared options
        SupportsAutoWebViewOption<UiAutomator2Options>,
        // General options: https://github.com/appium/appium-uiautomator2-driver#general
        SupportsDeviceNameOption<UiAutomator2Options>,
        SupportsUdidOption<UiAutomator2Options>,
        // Driver/Server options: https://github.com/appium/appium-uiautomator2-driver#driverserver
        SupportsSystemPortOption<UiAutomator2Options>,
        SupportsSkipServerInstallationOption<UiAutomator2Options>,
        SupportsUiautomator2ServerLaunchTimeoutOption<UiAutomator2Options>,
        SupportsUiautomator2ServerInstallTimeoutOption<UiAutomator2Options>,
        SupportsUiautomator2ServerReadTimeoutOption<UiAutomator2Options>,
        SupportsDisableWindowAnimationOption<UiAutomator2Options>,
        SupportsSkipDeviceInitializationOption<UiAutomator2Options>,
        SupportsOrientationOption<UiAutomator2Options>,
        SupportsClearSystemFilesOption<UiAutomator2Options>,
        SupportsEnablePerformanceLoggingOption<UiAutomator2Options>,
        // App options: https://github.com/appium/appium-uiautomator2-driver#app
        SupportsAppOption<UiAutomator2Options>,
        SupportsAppPackageOption<UiAutomator2Options>,
        SupportsAppActivityOption<UiAutomator2Options>,
        SupportsAppWaitActivityOption<UiAutomator2Options>,
        SupportsAppWaitPackageOption<UiAutomator2Options>,
        SupportsAppDurationOption<UiAutomator2Options>,
        SupportsAndroidInstallTimeoutOption<UiAutomator2Options>,
        SupportsAppWaitForLaunchOption<UiAutomator2Options>,
        SupportsIntentCategoryOption<UiAutomator2Options>,
        SupportsIntentActionOption<UiAutomator2Options>,
        SupportsIntentFlagsOption<UiAutomator2Options>,
        SupportsOptionalIntentArgumentsOption<UiAutomator2Options>,
        SupportsAutoGrantPermissionsOption<UiAutomator2Options>,
        SupportsOtherAppsOption<UiAutomator2Options>,
        SupportsUninstallOtherPackagesOption<UiAutomator2Options>,
        SupportsAllowTestPackagesOption<UiAutomator2Options>,
        SupportsRemoteAppsCacheLimitOption<UiAutomator2Options>,
        SupportsEnforceAppInstallOption<UiAutomator2Options>,
        // TODO: App localization options: https://github.com/appium/appium-uiautomator2-driver#app-localization
        SupportsLanguageOption<UiAutomator2Options>,
        SupportsLocaleOption<UiAutomator2Options> {
    public UiAutomator2Options() {
        setCommonOptions();
    }

    public UiAutomator2Options(Capabilities source) {
        super(source);
        setCommonOptions();
    }

    private void setCommonOptions() {
        setPlatformName(MobilePlatform.ANDROID);
        setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
    }
}
