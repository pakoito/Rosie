/*
 * The MIT License (MIT) Copyright (c) 2014 karumi Permission is hereby granted, free of charge,
 * to any person obtaining a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to
  * do so, subject to the following conditions: The above copyright notice and this permission
  * notice shall be included in all copies or substantial portions of the Software. THE SOFTWARE
  * IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
  * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
  * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
  * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.karumi.rosie.doubles;

import com.karumi.rosie.TestModule;
import com.karumi.rosie.view.RosieActivity;
import com.karumi.rosie.view.RosiePresenter;
import com.karumi.rosie.view.Presenter;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;

/**
 * Activity for run the tests
 */
public class FakeActivity extends RosieActivity {

  private static final int ANY_LAYOUT = android.R.layout.list_content;

  public FakeActivity() {
  }

  @Presenter RosiePresenter presenter = mock(RosiePresenter.class);

  @Override protected int getLayoutId() {
    return ANY_LAYOUT;
  }

  @Override protected List<Object> getActivityScopeModules() {
    return Arrays.asList((Object) new TestModule());
  }

  public RosiePresenter getPresenter() {
    return presenter;
  }
}
