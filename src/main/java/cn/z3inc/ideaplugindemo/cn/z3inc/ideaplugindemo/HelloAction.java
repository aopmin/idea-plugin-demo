package cn.z3inc.ideaplugindemo.cn.z3inc.ideaplugindemo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class HelloAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showInfoMessage("为了让你开心，我特意编写了一段关于程序员的小笑话...", "helloworld");
    }
}
