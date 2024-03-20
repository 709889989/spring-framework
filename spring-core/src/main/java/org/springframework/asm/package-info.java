/**
 * 避免jar包冲突，重打包asm包
 * spring 使用asm获取类class信息，为避免潜在jar包冲突，重新repackage 了asm包
 *
 * Spring's repackaging of
 * <a href="https://gitlab.ow2.org/asm/asm">ASM 9.x</a>
 * (with Spring-specific patches; for internal use only).
 *
 * <p>This repackaging technique avoids any potential conflicts with
 * dependencies on ASM at the application level or from third-party
 * libraries and frameworks.
 *
 * <p>As this repackaging happens at the class file level, sources
 * and javadocs are not available here.
 */
package org.springframework.asm;
