/*
 * Copyright (c) 2017 - All Rights Reserved - Arash Hatami
 */

package ir.hatamiarash.flashlight;

public class Events {
    public static class StateChanged {
        private static boolean mIsEnabled;

        StateChanged(boolean isEnabled) {
            mIsEnabled = isEnabled;
        }

        public boolean getIsEnabled() {
            return mIsEnabled;
        }
    }

    public static class CameraUnavailable {
    }
}