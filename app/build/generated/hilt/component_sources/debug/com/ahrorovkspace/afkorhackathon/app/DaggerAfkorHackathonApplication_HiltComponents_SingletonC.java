package com.ahrorovkspace.afkorhackathon.app;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.ahrorovkspace.afkorhackathon.app.navigation.NavigationViewModel;
import com.ahrorovkspace.afkorhackathon.app.navigation.NavigationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager;
import com.ahrorovkspace.afkorhackathon.data.network.remote.AfkorHackApi;
import com.ahrorovkspace.afkorhackathon.di.AppModule;
import com.ahrorovkspace.afkorhackathon.di.AppModule_ProvideAfkorHackApiFactory;
import com.ahrorovkspace.afkorhackathon.di.AppModule_ProvideAfkorHackRepositoryFactory;
import com.ahrorovkspace.afkorhackathon.di.AppModule_ProvideSessionManagerFactory;
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository;
import com.ahrorovkspace.afkorhackathon.domain.application.useCase.SendApplicationUseCase;
import com.ahrorovkspace.afkorhackathon.domain.authorization.useCase.AuthorizationUseCase;
import com.ahrorovkspace.afkorhackathon.domain.companyById.useCase.GetCompanyByIdUseCase;
import com.ahrorovkspace.afkorhackathon.domain.main.useCase.GetVacanciesUseCase;
import com.ahrorovkspace.afkorhackathon.domain.myApplication.useCase.ApproveApplicationUseCase;
import com.ahrorovkspace.afkorhackathon.domain.myApplication.useCase.GetMyApplicationUseCase;
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase.ChangeProfileInfoUseCase;
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase.GetProfileInfoUseCase;
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.useCase.RefreshTokenUseCase;
import com.ahrorovkspace.afkorhackathon.domain.registration.useCase.RegistrationUseCase;
import com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationViewModel;
import com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationViewModel;
import com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsViewModel;
import com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainViewModel;
import com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainViewModel_HiltModules_KeyModule_ProvideFactory;
import com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationViewModel;
import com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileViewModel;
import com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileViewModel_HiltModules_KeyModule_ProvideFactory;
import com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen.RegistrationViewModel;
import com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen.RegistrationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.ahrorovkspace.afkorhackathon.presentation.settingsScreen.SettingsViewModel;
import com.ahrorovkspace.afkorhackathon.presentation.settingsScreen.SettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.ahrorovkspace.afkorhackathon.presentation.splashScreen.SplashViewModel;
import com.ahrorovkspace.afkorhackathon.presentation.splashScreen.SplashViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAfkorHackathonApplication_HiltComponents_SingletonC {
  private DaggerAfkorHackathonApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public AfkorHackathonApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements AfkorHackathonApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public AfkorHackathonApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements AfkorHackathonApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public AfkorHackathonApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements AfkorHackathonApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public AfkorHackathonApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements AfkorHackathonApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public AfkorHackathonApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements AfkorHackathonApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public AfkorHackathonApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements AfkorHackathonApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public AfkorHackathonApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements AfkorHackathonApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public AfkorHackathonApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends AfkorHackathonApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends AfkorHackathonApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends AfkorHackathonApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends AfkorHackathonApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(10).add(AuthorizationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(BottomSheetApplicationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ChatsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MainViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MyApplicationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(NavigationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ProfileViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(RegistrationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SplashViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends AfkorHackathonApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AuthorizationViewModel> authorizationViewModelProvider;

    private Provider<BottomSheetApplicationViewModel> bottomSheetApplicationViewModelProvider;

    private Provider<ChatsViewModel> chatsViewModelProvider;

    private Provider<MainViewModel> mainViewModelProvider;

    private Provider<MyApplicationViewModel> myApplicationViewModelProvider;

    private Provider<NavigationViewModel> navigationViewModelProvider;

    private Provider<ProfileViewModel> profileViewModelProvider;

    private Provider<RegistrationViewModel> registrationViewModelProvider;

    private Provider<SettingsViewModel> settingsViewModelProvider;

    private Provider<SplashViewModel> splashViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    private AuthorizationUseCase authorizationUseCase() {
      return new AuthorizationUseCase(singletonCImpl.provideAfkorHackRepositoryProvider.get());
    }

    private SendApplicationUseCase sendApplicationUseCase() {
      return new SendApplicationUseCase(singletonCImpl.provideAfkorHackRepositoryProvider.get());
    }

    private RefreshTokenUseCase refreshTokenUseCase() {
      return new RefreshTokenUseCase(singletonCImpl.provideAfkorHackRepositoryProvider.get());
    }

    private GetVacanciesUseCase getVacanciesUseCase() {
      return new GetVacanciesUseCase(singletonCImpl.provideAfkorHackRepositoryProvider.get());
    }

    private GetCompanyByIdUseCase getCompanyByIdUseCase() {
      return new GetCompanyByIdUseCase(singletonCImpl.provideAfkorHackRepositoryProvider.get());
    }

    private GetMyApplicationUseCase getMyApplicationUseCase() {
      return new GetMyApplicationUseCase(singletonCImpl.provideAfkorHackRepositoryProvider.get());
    }

    private ApproveApplicationUseCase approveApplicationUseCase() {
      return new ApproveApplicationUseCase(singletonCImpl.provideAfkorHackRepositoryProvider.get());
    }

    private GetProfileInfoUseCase getProfileInfoUseCase() {
      return new GetProfileInfoUseCase(singletonCImpl.provideAfkorHackRepositoryProvider.get());
    }

    private ChangeProfileInfoUseCase changeProfileInfoUseCase() {
      return new ChangeProfileInfoUseCase(singletonCImpl.provideAfkorHackRepositoryProvider.get());
    }

    private RegistrationUseCase registrationUseCase() {
      return new RegistrationUseCase(singletonCImpl.provideAfkorHackRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.authorizationViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.bottomSheetApplicationViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.chatsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.mainViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.myApplicationViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.navigationViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.profileViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
      this.registrationViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 7);
      this.settingsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 8);
      this.splashViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 9);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(10).put("com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationViewModel", ((Provider) authorizationViewModelProvider)).put("com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationViewModel", ((Provider) bottomSheetApplicationViewModelProvider)).put("com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsViewModel", ((Provider) chatsViewModelProvider)).put("com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainViewModel", ((Provider) mainViewModelProvider)).put("com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationViewModel", ((Provider) myApplicationViewModelProvider)).put("com.ahrorovkspace.afkorhackathon.app.navigation.NavigationViewModel", ((Provider) navigationViewModelProvider)).put("com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileViewModel", ((Provider) profileViewModelProvider)).put("com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen.RegistrationViewModel", ((Provider) registrationViewModelProvider)).put("com.ahrorovkspace.afkorhackathon.presentation.settingsScreen.SettingsViewModel", ((Provider) settingsViewModelProvider)).put("com.ahrorovkspace.afkorhackathon.presentation.splashScreen.SplashViewModel", ((Provider) splashViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationViewModel 
          return (T) new AuthorizationViewModel(viewModelCImpl.authorizationUseCase(), singletonCImpl.provideSessionManagerProvider.get());

          case 1: // com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationViewModel 
          return (T) new BottomSheetApplicationViewModel(singletonCImpl.provideSessionManagerProvider.get(), viewModelCImpl.sendApplicationUseCase(), viewModelCImpl.refreshTokenUseCase());

          case 2: // com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsViewModel 
          return (T) new ChatsViewModel(singletonCImpl.provideSessionManagerProvider.get());

          case 3: // com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainViewModel 
          return (T) new MainViewModel(singletonCImpl.provideSessionManagerProvider.get(), viewModelCImpl.getVacanciesUseCase(), viewModelCImpl.refreshTokenUseCase(), viewModelCImpl.getCompanyByIdUseCase());

          case 4: // com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationViewModel 
          return (T) new MyApplicationViewModel(singletonCImpl.provideSessionManagerProvider.get(), viewModelCImpl.getMyApplicationUseCase(), viewModelCImpl.refreshTokenUseCase(), viewModelCImpl.approveApplicationUseCase());

          case 5: // com.ahrorovkspace.afkorhackathon.app.navigation.NavigationViewModel 
          return (T) new NavigationViewModel(singletonCImpl.provideSessionManagerProvider.get());

          case 6: // com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileViewModel 
          return (T) new ProfileViewModel(viewModelCImpl.getProfileInfoUseCase(), singletonCImpl.provideSessionManagerProvider.get(), viewModelCImpl.refreshTokenUseCase(), viewModelCImpl.changeProfileInfoUseCase());

          case 7: // com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen.RegistrationViewModel 
          return (T) new RegistrationViewModel(viewModelCImpl.registrationUseCase(), singletonCImpl.provideSessionManagerProvider.get());

          case 8: // com.ahrorovkspace.afkorhackathon.presentation.settingsScreen.SettingsViewModel 
          return (T) new SettingsViewModel();

          case 9: // com.ahrorovkspace.afkorhackathon.presentation.splashScreen.SplashViewModel 
          return (T) new SplashViewModel(singletonCImpl.provideSessionManagerProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends AfkorHackathonApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends AfkorHackathonApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends AfkorHackathonApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<AfkorHackApi> provideAfkorHackApiProvider;

    private Provider<AfkorHackRepository> provideAfkorHackRepositoryProvider;

    private Provider<DataStoreManager> provideSessionManagerProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideAfkorHackApiProvider = DoubleCheck.provider(new SwitchingProvider<AfkorHackApi>(singletonCImpl, 1));
      this.provideAfkorHackRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<AfkorHackRepository>(singletonCImpl, 0));
      this.provideSessionManagerProvider = DoubleCheck.provider(new SwitchingProvider<DataStoreManager>(singletonCImpl, 2));
    }

    @Override
    public void injectAfkorHackathonApplication(
        AfkorHackathonApplication afkorHackathonApplication) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository 
          return (T) AppModule_ProvideAfkorHackRepositoryFactory.provideAfkorHackRepository(singletonCImpl.provideAfkorHackApiProvider.get());

          case 1: // com.ahrorovkspace.afkorhackathon.data.network.remote.AfkorHackApi 
          return (T) AppModule_ProvideAfkorHackApiFactory.provideAfkorHackApi();

          case 2: // com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager 
          return (T) AppModule_ProvideSessionManagerFactory.provideSessionManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
