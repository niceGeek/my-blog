package de.shingiro;

import io.quarkus.test.junit.NativeImageTest;
import org.junit.jupiter.api.Disabled;

@Disabled
@NativeImageTest
public class NativeBlogResourceIT extends BlogResourceTest {

    // Execute the same tests but in native mode.
}