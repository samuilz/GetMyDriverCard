package com.quicksilver.getmydrivercard.diconfig;

import com.quicksilver.getmydrivercard.views.requests.RequestsActivity;
import com.quicksilver.getmydrivercard.views.step1.Step1Activity;
import com.quicksilver.getmydrivercard.views.step4.Step4Activity;
import com.quicksilver.getmydrivercard.views.users.login.LoginActivity;
import com.quicksilver.getmydrivercard.views.users.register.RegisterActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginActivity loginActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = Step1Module.class)
    abstract Step1Activity step1Activity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = Step4Module.class)
    abstract Step4Activity step4Activity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = RegisterModule.class)
    abstract RegisterActivity registerActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = RequestsModule.class)
    abstract RequestsActivity requestsActivity();
}
