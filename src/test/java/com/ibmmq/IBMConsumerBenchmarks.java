package com.ibmmq;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
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
//@BenchmarkMetaData(key = "context", value = "ConcurrentConsume")
//@BenchmarkMetaData(key = "context", value = "NonconcurrentConsume")
@BenchmarkMetaData(key = "domain", value = "java")
public class IBMConsumerBenchmarks {
	private IBMConsumer myConsumer;

	@Setup(Level.Trial)
	public void setup() {
		myConsumer = new IBMConsumer();
	}

	@TearDown(Level.Trial)
	public void tearDown() {
		myConsumer.closeConnection();
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "IBM MQ")
	@BenchmarkMetaData(key = "libVendor", value = "IBM")
	@BenchmarkMetaData(key = "libUrl", value = "https://www.ibm.com/products/mq")
	// @BenchmarkMetaData(key = "libVersion", value = "9.2.2.0 Base")
	// @BenchmarkMetaData(key = "libVersion", value = "9.0.5.0 Base")
	@BenchmarkMetaData(key = "libDescription", value = "IBM MQ offers enterprise-grade messaging capabilities that skillfully and safely move information between applications.")
	@BenchmarkMetaData(key = "actionName", value = "Consume 1000 (512)")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.ibm.mq.allclient")
	@BenchmarkMetaData(key = "title", value = "Consuming 1000 msgs of 512 bytes")
	@BenchmarkMetaData(key = "description", value = "Consumed 1000 messages of size 512 bytes per iteration")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	public void ibmConsume1(Blackhole bh) {
		myConsumer.consume(1000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "IBM MQ")
	@BenchmarkMetaData(key = "libVendor", value = "IBM")
	@BenchmarkMetaData(key = "libUrl", value = "https://www.ibm.com/products/mq")
	// @BenchmarkMetaData(key = "libVersion", value = "9.2.2.0 Base")
	// @BenchmarkMetaData(key = "libVersion", value = "9.0.5.0 Base")
	@BenchmarkMetaData(key = "libDescription", value = "IBM MQ offers enterprise-grade messaging capabilities that skillfully and safely move information between applications.")
	@BenchmarkMetaData(key = "actionName", value = "Consume 10000 (512)")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.ibm.mq.allclient")
	@BenchmarkMetaData(key = "title", value = "Consuming 10000 msgs of 512 bytes")
	@BenchmarkMetaData(key = "description", value = "Consumed 10000 messages of size 512 bytes per iteration")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	public void ibmConsume2(Blackhole bh) {
		myConsumer.consume(10000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "IBM MQ")
	@BenchmarkMetaData(key = "libVendor", value = "IBM")
	@BenchmarkMetaData(key = "libUrl", value = "https://www.ibm.com/products/mq")
	// @BenchmarkMetaData(key = "libVersion", value = "9.2.2.0 Base")
	// @BenchmarkMetaData(key = "libVersion", value = "9.0.5.0 Base")
	@BenchmarkMetaData(key = "libDescription", value = "IBM MQ offers enterprise-grade messaging capabilities that skillfully and safely move information between applications.")
	@BenchmarkMetaData(key = "actionName", value = "Consume 1000 (1024)")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.ibm.mq.allclient")
	@BenchmarkMetaData(key = "title", value = "Consuming 1000 msgs of 1024 bytes")
	@BenchmarkMetaData(key = "description", value = "Consumed 1000 messages of size 1024 bytes per iteration")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	public void ibmConsume3(Blackhole bh) {
		myConsumer.consume(1000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "IBM MQ")
	@BenchmarkMetaData(key = "libVendor", value = "IBM")
	@BenchmarkMetaData(key = "libUrl", value = "https://www.ibm.com/products/mq")
	// @BenchmarkMetaData(key = "libVersion", value = "9.2.2.0 Base")
	// @BenchmarkMetaData(key = "libVersion", value = "9.0.5.0 Base")
	@BenchmarkMetaData(key = "libDescription", value = "IBM MQ offers enterprise-grade messaging capabilities that skillfully and safely move information between applications.")
	@BenchmarkMetaData(key = "actionName", value = "Consume 10000 (1024)")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.ibm.mq.allclient")
	@BenchmarkMetaData(key = "title", value = "Consuming 10000 msgs of 1024 bytes")
	@BenchmarkMetaData(key = "description", value = "Consumed 10000 messages of size 1024 bytes per iteration")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	public void ibmConsume4(Blackhole bh) {
		myConsumer.consume(10000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "IBM MQ")
	@BenchmarkMetaData(key = "libVendor", value = "IBM")
	@BenchmarkMetaData(key = "libUrl", value = "https://www.ibm.com/products/mq")
	// @BenchmarkMetaData(key = "libVersion", value = "9.2.2.0 Base")
	// @BenchmarkMetaData(key = "libVersion", value = "9.0.5.0 Base")
	@BenchmarkMetaData(key = "libDescription", value = "IBM MQ offers enterprise-grade messaging capabilities that skillfully and safely move information between applications.")
	@BenchmarkMetaData(key = "actionName", value = "Consume 1000 (10240)")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.ibm.mq.allclient")
	@BenchmarkMetaData(key = "title", value = "Consuming 1000 msgs of 10240 bytes")
	@BenchmarkMetaData(key = "description", value = "Consumed 1000 messages of size 10240 bytes per iteration")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	public void ibmConsume5(Blackhole bh) {
		myConsumer.consume(1000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "IBM MQ")
	@BenchmarkMetaData(key = "libVendor", value = "IBM")
	@BenchmarkMetaData(key = "libUrl", value = "https://www.ibm.com/products/mq")
	// @BenchmarkMetaData(key = "libVersion", value = "9.2.2.0 Base")
	// @BenchmarkMetaData(key = "libVersion", value = "9.0.5.0 Base")
	@BenchmarkMetaData(key = "libDescription", value = "IBM MQ offers enterprise-grade messaging capabilities that skillfully and safely move information between applications.")
	@BenchmarkMetaData(key = "actionName", value = "Consume 10000 (10240)")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.ibm.mq.allclient")
	@BenchmarkMetaData(key = "title", value = "Consuming 10000 msgs of 10240 bytes")
	@BenchmarkMetaData(key = "description", value = "Consumed 10000 messages of size 10240 bytes per iteration")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	public void ibmConsume6(Blackhole bh) {
		myConsumer.consume(10000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "IBM MQ")
	@BenchmarkMetaData(key = "libVendor", value = "IBM")
	@BenchmarkMetaData(key = "libUrl", value = "https://www.ibm.com/products/mq")
	// @BenchmarkMetaData(key = "libVersion", value = "9.2.2.0 Base")
	// @BenchmarkMetaData(key = "libVersion", value = "9.0.5.0 Base")
	@BenchmarkMetaData(key = "libDescription", value = "IBM MQ offers enterprise-grade messaging capabilities that skillfully and safely move information between applications.")
	@BenchmarkMetaData(key = "actionName", value = "Consume 1000 (32768)")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.ibm.mq.allclient")
	@BenchmarkMetaData(key = "title", value = "Consuming 1000 msgs of 32768 bytes")
	@BenchmarkMetaData(key = "description", value = "Consumed 1000 messages of size 32768 bytes per iteration")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	public void ibmConsume7(Blackhole bh) {
		myConsumer.consume(1000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "IBM MQ")
	@BenchmarkMetaData(key = "libVendor", value = "IBM")
	@BenchmarkMetaData(key = "libUrl", value = "https://www.ibm.com/products/mq")
	// @BenchmarkMetaData(key = "libVersion", value = "9.2.2.0 Base")
	// @BenchmarkMetaData(key = "libVersion", value = "9.0.5.0 Base")
	@BenchmarkMetaData(key = "libDescription", value = "IBM MQ offers enterprise-grade messaging capabilities that skillfully and safely move information between applications.")
	@BenchmarkMetaData(key = "actionName", value = "Consume 10000 (32768)")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.ibm.mq.allclient")
	@BenchmarkMetaData(key = "title", value = "Consuming 10000 msgs of 32768 bytes")
	@BenchmarkMetaData(key = "description", value = "Consumed 10000 messages of size 32768 bytes per iteration")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	public void ibmConsume8(Blackhole bh) {
		myConsumer.consume(10000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "IBM MQ")
	@BenchmarkMetaData(key = "libVendor", value = "IBM")
	@BenchmarkMetaData(key = "libUrl", value = "https://www.ibm.com/products/mq")
	// @BenchmarkMetaData(key = "libVersion", value = "9.2.2.0 Base")
	// @BenchmarkMetaData(key = "libVersion", value = "9.0.5.0 Base")
	@BenchmarkMetaData(key = "libDescription", value = "IBM MQ offers enterprise-grade messaging capabilities that skillfully and safely move information between applications.")
	@BenchmarkMetaData(key = "actionName", value = "Consume 1000 (65536)")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.ibm.mq.allclient")
	@BenchmarkMetaData(key = "title", value = "Consuming 1000 msgs of 65536 bytes")
	@BenchmarkMetaData(key = "description", value = "Consumed 1000 messages of size 65536 bytes per iteration")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	public void ibmConsume9(Blackhole bh) {
		myConsumer.consume(1000);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "IBM MQ")
	@BenchmarkMetaData(key = "libVendor", value = "IBM")
	@BenchmarkMetaData(key = "libUrl", value = "https://www.ibm.com/products/mq")
	// @BenchmarkMetaData(key = "libVersion", value = "9.2.2.0 Base")
	// @BenchmarkMetaData(key = "libVersion", value = "9.0.5.0 Base")
	@BenchmarkMetaData(key = "libDescription", value = "IBM MQ offers enterprise-grade messaging capabilities that skillfully and safely move information between applications.")
	@BenchmarkMetaData(key = "actionName", value = "Consume 10000 (65536)")
	@BenchmarkMetaData(key = "libSymbolicName", value = "com.ibm.mq.allclient")
	@BenchmarkMetaData(key = "title", value = "Consuming 10000 msgs of 65536 bytes")
	@BenchmarkMetaData(key = "description", value = "Consumed 10000 messages of size 65536 bytes per iteration")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.NANOSECONDS)
	public void ibmConsume10(Blackhole bh) {
		myConsumer.consume(10000);
	}

}
