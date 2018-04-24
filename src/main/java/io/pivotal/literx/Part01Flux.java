package io.pivotal.literx;

import java.time.Duration;
import java.util.Arrays;
import reactor.core.publisher.Flux;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="http://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

	// Return an empty Flux
	Flux<String> emptyFlux() {
		return Flux.empty();
	}

//========================================================================================

	// Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
	Flux<String> fooBarFluxFromValues() {
		return Flux.just("foo", "bar");
	}

//========================================================================================

	// Create a Flux from a List that contains 2 values "foo" and "bar"
	Flux<String> fooBarFluxFromList() {
		return Flux.fromIterable(Arrays.asList("foo", "bar"));
	}

//========================================================================================

	// Create a Flux that emits an IllegalStateException
	Flux<String> errorFlux() {
		return Flux.error(new IllegalStateException());
	}

//========================================================================================

        // Create a Flux that emits increasing values from 0 to 9 each 100ms
	Flux<Long> counter() {
		return Flux.just(0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).delayElements(Duration.ofMillis(100L));
	}

}
