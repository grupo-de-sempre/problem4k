package org.gds

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SampleTest {
    @Test
    fun `hello returns a string`() {
        val sample = Sample()
        assertThat(sample.hello()).isInstanceOf(String::class.java)
    }

    @Test
    fun `hello returns a string with the correct value`() {
        val sample = Sample()
        assertThat(sample.hello()).isEqualTo("Hello, world!")
    }
}