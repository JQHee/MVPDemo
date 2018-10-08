package com.marlon.simplemvpdemo.contract;

import com.marlon.simplemvpdemo.base.BasePresenter;
import com.marlon.simplemvpdemo.base.BaseView;

/**
 * @author Marlon
 * @desc
 * @date 2018/10/8
 */
public class LoginContract {
    public interface View extends BaseView<Presenter>{
        void gotoMain();
    }

    public interface Presenter extends BasePresenter{
        void login();
    }
}
