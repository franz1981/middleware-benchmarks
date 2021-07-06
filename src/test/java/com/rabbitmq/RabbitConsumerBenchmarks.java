
package com.rabbitmq;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import com.gocypher.cybench.core.annotation.BenchmarkMetaData;

@State(Scope.Benchmark)
@BenchmarkMetaData(key = "isLibraryBenchmark", value = "true")
@BenchmarkMetaData(key = "context", value = "NonconcurrentConsume")
@BenchmarkMetaData(key = "domain", value = "java")
public class RabbitConsumerBenchmarks {
	private RabbitConsumer myConsumer;

	@Setup(Level.Trial)
	public void setup() {
		myConsumer = new RabbitConsumer();
	}

	@TearDown(Level.Trial)
	public void tearDown() {
		myConsumer.closeConnection();
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libVendor", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libUrl", value = "https://github.com/rabbitmq/rabbitmq-server/releases/")
	@BenchmarkMetaData(key = "libVersion", value = "3.8.17 Base")
	@BenchmarkMetaData(key = "libDescription", value = "RabbitMQ is the most widely deployed open source message broker.")
	@BenchmarkMetaData(key = "actionName", value = "Receive-1000-512b")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.rabbitmq.amqp-client")
	@BenchmarkMetaData(key = "title", value = "Consuming 1000 msgs of 512 bytes")
	@BenchmarkMetaData(key = "description", value = "RabbitMQ Client Connection basicGet(), no msg persistence, auto msg acknowledgement")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 5, timeUnit = TimeUnit.NANOSECONDS)
	public void rabbitConsume1(Blackhole bh) {
		myConsumer.consume(1000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libVendor", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libUrl", value = "https://github.com/rabbitmq/rabbitmq-server/releases/")
	@BenchmarkMetaData(key = "libVersion", value = "3.8.17 Base")
	@BenchmarkMetaData(key = "libDescription", value = "RabbitMQ is the most widely deployed open source message broker.")
	@BenchmarkMetaData(key = "actionName", value = "Receive-10000-512b")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.rabbitmq.amqp-client")
	@BenchmarkMetaData(key = "title", value = "Consuming 10000 msgs of 512 bytes")
	@BenchmarkMetaData(key = "description", value = "RabbitMQ Client Connection basicGet(), no msg persistence, auto msg acknowledgement")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 5, timeUnit = TimeUnit.NANOSECONDS)
	public void rabbitConsume2(Blackhole bh) {
		myConsumer.consume(10000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libVendor", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libUrl", value = "https://github.com/rabbitmq/rabbitmq-server/releases/")
	@BenchmarkMetaData(key = "libVersion", value = "3.8.17 Base")
	@BenchmarkMetaData(key = "libDescription", value = "RabbitMQ is the most widely deployed open source message broker.")
	@BenchmarkMetaData(key = "actionName", value = "Receive-1000-1k")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.rabbitmq.amqp-client")
	@BenchmarkMetaData(key = "title", value = "Consuming 1000 msgs of 1024 bytes")
	@BenchmarkMetaData(key = "description", value = "RabbitMQ Client Connection basicGet(), no msg persistence, auto msg acknowledgement")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 5, timeUnit = TimeUnit.NANOSECONDS)
	public void rabbitConsume3(Blackhole bh) {
		myConsumer.consume(1000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libVendor", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libUrl", value = "https://github.com/rabbitmq/rabbitmq-server/releases/")
	@BenchmarkMetaData(key = "libVersion", value = "3.8.17 Base")
	@BenchmarkMetaData(key = "libDescription", value = "RabbitMQ is the most widely deployed open source message broker.")
	@BenchmarkMetaData(key = "actionName", value = "Receive-10000-1k")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.rabbitmq.amqp-client")
	@BenchmarkMetaData(key = "title", value = "Consuming 10000 msgs of 1024 bytes")
	@BenchmarkMetaData(key = "description", value = "RabbitMQ Client Connection basicGet(), no msg persistence, auto msg acknowledgement")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 5, timeUnit = TimeUnit.NANOSECONDS)
	public void rabbitConsume4(Blackhole bh) {
		myConsumer.consume(10000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libVendor", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libUrl", value = "https://github.com/rabbitmq/rabbitmq-server/releases/")
	@BenchmarkMetaData(key = "libVersion", value = "3.8.17 Base")
	@BenchmarkMetaData(key = "libDescription", value = "RabbitMQ is the most widely deployed open source message broker.")
	@BenchmarkMetaData(key = "actionName", value = "Receive-1000-10k")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.rabbitmq.amqp-client")
	@BenchmarkMetaData(key = "title", value = "Consuming 1000 msgs of 10240 bytes")
	@BenchmarkMetaData(key = "description", value = "RabbitMQ Client Connection basicGet(), no msg persistence, auto msg acknowledgement")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 5, timeUnit = TimeUnit.NANOSECONDS)
	public void rabbitConsume5(Blackhole bh) {
		myConsumer.consume(1000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libVendor", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libUrl", value = "https://github.com/rabbitmq/rabbitmq-server/releases/")
	@BenchmarkMetaData(key = "libVersion", value = "3.8.17 Base")
	@BenchmarkMetaData(key = "libDescription", value = "RabbitMQ is the most widely deployed open source message broker.")
	@BenchmarkMetaData(key = "actionName", value = "Receive-10000-10k")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.rabbitmq.amqp-client")
	@BenchmarkMetaData(key = "title", value = "Consuming 10000 msgs of 10240 bytes")
	@BenchmarkMetaData(key = "description", value = "RabbitMQ Client Connection basicGet(), no msg persistence, auto msg acknowledgement")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 5, timeUnit = TimeUnit.NANOSECONDS)
	public void rabbitConsume6(Blackhole bh) {
		myConsumer.consume(10000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libVendor", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libUrl", value = "https://github.com/rabbitmq/rabbitmq-server/releases/")
	@BenchmarkMetaData(key = "libVersion", value = "3.8.17 Base")
	@BenchmarkMetaData(key = "libDescription", value = "RabbitMQ is the most widely deployed open source message broker.")
	@BenchmarkMetaData(key = "actionName", value = "Receive-1000-32k")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.rabbitmq.amqp-client")
	@BenchmarkMetaData(key = "title", value = "Consuming 1000 msgs of 32768 bytes")
	@BenchmarkMetaData(key = "description", value = "RabbitMQ Client Connection basicGet(), no msg persistence, auto msg acknowledgement")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 5, timeUnit = TimeUnit.NANOSECONDS)
	public void rabbitConsume7(Blackhole bh) {
		myConsumer.consume(1000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libVendor", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libUrl", value = "https://github.com/rabbitmq/rabbitmq-server/releases/")
	@BenchmarkMetaData(key = "libVersion", value = "3.8.17 Base")
	@BenchmarkMetaData(key = "libDescription", value = "RabbitMQ is the most widely deployed open source message broker.")
	@BenchmarkMetaData(key = "actionName", value = "Receive-10000-32k")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.rabbitmq.amqp-client")
	@BenchmarkMetaData(key = "title", value = "Consuming 10000 msgs of 32768 bytes")
	@BenchmarkMetaData(key = "description", value = "RabbitMQ Client Connection basicGet(), no msg persistence, auto msg acknowledgement")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 5, timeUnit = TimeUnit.NANOSECONDS)
	public void rabbitConsume8(Blackhole bh) {
		myConsumer.consume(10000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libVendor", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libUrl", value = "https://github.com/rabbitmq/rabbitmq-server/releases/")
	@BenchmarkMetaData(key = "libVersion", value = "3.8.17 Base")
	@BenchmarkMetaData(key = "libDescription", value = "RabbitMQ is the most widely deployed open source message broker.")
	@BenchmarkMetaData(key = "actionName", value = "Receive-1000-64k")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.rabbitmq.amqp-client")
	@BenchmarkMetaData(key = "title", value = "Consuming 1000 msgs of 65536 bytes")
	@BenchmarkMetaData(key = "description", value = "RabbitMQ Client Connection basicGet(), no msg persistence, auto msg acknowledgement")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 5, timeUnit = TimeUnit.NANOSECONDS)
	public void rabbitConsume9(Blackhole bh) {
		myConsumer.consume(1000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libVendor", value = "RabbitMQ")
	@BenchmarkMetaData(key = "libUrl", value = "https://github.com/rabbitmq/rabbitmq-server/releases/")
	@BenchmarkMetaData(key = "libVersion", value = "3.8.17 Base")
	@BenchmarkMetaData(key = "libDescription", value = "RabbitMQ is the most widely deployed open source message broker.")
	@BenchmarkMetaData(key = "actionName", value = "Receive-10000-64k")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.rabbitmq.amqp-client")
	@BenchmarkMetaData(key = "title", value = "Consuming 10000 msgs of 65536 bytes")
	@BenchmarkMetaData(key = "description", value = "RabbitMQ Client Connection basicGet(), no msg persistence, auto msg acknowledgement")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 5, timeUnit = TimeUnit.NANOSECONDS)
	public void rabbitConsume10(Blackhole bh) {
		myConsumer.consume(10000);
	}

}
