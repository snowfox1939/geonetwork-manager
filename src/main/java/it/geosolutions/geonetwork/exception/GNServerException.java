/*
 *  GeoNetwork-Manager - Simple Manager Library for GeoNetwork
 *
 *  Copyright (C) 2007,2011 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package it.geosolutions.geonetwork.exception;

/**
 *
 * @author ETj (etj at geo-solutions.it)
 */
public class GNServerException extends GNException {

    private int httpCode = -1;

    public GNServerException(String message) {
        super(message);
    }

    public GNServerException(String message, int code) {
        super(message);
        this.httpCode = code;
    }

    public GNServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public GNServerException(String message, int code, Throwable cause) {
        super(message, cause);
        this.httpCode = code;
    }

    public int getHttpCode() {
        return httpCode;
    }
}
