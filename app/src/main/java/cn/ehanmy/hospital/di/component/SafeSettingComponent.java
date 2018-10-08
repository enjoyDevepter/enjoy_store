package cn.ehanmy.hospital.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import cn.ehanmy.hospital.di.module.SafeSettingModule;

import com.jess.arms.di.scope.ActivityScope;

import cn.ehanmy.hospital.mvp.ui.activity.SafeSettingActivity;

@ActivityScope
@Component(modules = SafeSettingModule.class, dependencies = AppComponent.class)
public interface SafeSettingComponent {
    void inject(SafeSettingActivity activity);
}