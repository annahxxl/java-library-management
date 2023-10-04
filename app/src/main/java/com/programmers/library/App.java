/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.programmers.library;

import com.programmers.library.util.ScannerUtil;

public class App {
    public static void run() {
        Mode.showModes();

        int modeId = ScannerUtil.getInstance().inputInt();

        Mode mode = Mode.selectMode(modeId);
        mode.run();
    }

    public static void main(String[] args) {
        run();
    }
}
