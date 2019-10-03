package arlyn.mvp.base;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public abstract  class BaseActivity extends FragmentActivity implements FragmentListener{


    protected BaseFragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeView();
        initializeFragment();
    }

    protected abstract void initializeFragment();

    protected abstract void initializeView();

    protected void setCurrentFragment(BaseFragment fragment, boolean addToBackStack) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (currentFragment != null && addToBackStack) {
            fragmentTransaction.addToBackStack(currentFragment.getTitle());
        }

        fragmentTransaction.replace(R.id.flFragmentContainer, fragment, fragment.getTitle());
        fragmentTransaction.commit();

        this.currentFragment = fragment;
    }

    @Override
    public void setTitle(String title) {
//        this.setTitle(title); error here
    }
}