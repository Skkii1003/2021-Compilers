package com.njuse.seecjvm.instructions.load;

import com.njuse.seecjvm.instructions.base.Index8Instruction;
import com.njuse.seecjvm.runtime.StackFrame;

public class ILOAD extends Index8Instruction {

    /**
     * TODO：实现这条指令
     * 其中成员index是这条指令的参数，已经读取好了
     */
    @Override
    public void execute(StackFrame frame) {
        int i = frame.getLocalVars().getInt(this.index);
        frame.getOperandStack().pushInt(i);
    }
}
