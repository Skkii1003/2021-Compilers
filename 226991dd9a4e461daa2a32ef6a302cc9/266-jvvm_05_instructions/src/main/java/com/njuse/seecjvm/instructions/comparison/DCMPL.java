package com.njuse.seecjvm.instructions.comparison;

import com.njuse.seecjvm.instructions.base.NoOperandsInstruction;
import com.njuse.seecjvm.runtime.StackFrame;

public class DCMPL extends NoOperandsInstruction {

    /**
     * TODO：实现这条指令
     */
    @Override
    public void execute(StackFrame frame) {
        double d1=frame.getOperandStack().popDouble();
        double d2=frame.getOperandStack().popDouble();
        if(d2>d1){
            frame.getOperandStack().pushInt(1);
        }else if(d2==d1){
            frame.getOperandStack().pushInt(0);
        }else if(d2<d1){
            frame.getOperandStack().pushInt(-1);
        }else frame.getOperandStack().pushInt(-1);
    }
}
