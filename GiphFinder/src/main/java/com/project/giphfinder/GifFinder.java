package com.project.giphfinder;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;


public class GifFinder extends AnAction {

    public GifFinder() {
        super();
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {

        Project project = event.getData(PlatformDataKeys.PROJECT);

        final Editor editor = event.getRequiredData(CommonDataKeys.EDITOR);
        final String selectedText = editor.getSelectionModel().getSelectedText();

        String url = "https://giphy.com/search/" + selectedText;
        if (selectedText != null) {
            BrowserUtil.browse(url);
        }
    }
}
